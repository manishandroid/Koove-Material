package com.koove.retrofit;

import android.content.Context;
import android.view.View;

import com.google.gson.GsonBuilder;
import com.koove.koovematerial.Activity.BaseActivity;
import com.koove.koovematerial.Constants.GlobalVariables;
import com.koove.koovematerial.R;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MyCallback<T> implements Callback<T>
{
private RestCallback restCallback;
private static String defaultMessage = "Loading";
private ProgressHUD mProgressHUD;
private View v;
private BaseActivity baseActivity;
private GlobalVariables.SERVICE_MODE mode;
private UtilitySingleton utilitySingleton;

/**
 * Description : Callback with custom message
 */
@SuppressWarnings("unchecked")
public MyCallback(Context context, RestCallback restCallback, boolean showProgress, View v, String message, GlobalVariables.SERVICE_MODE mode)
{
    this.restCallback = restCallback;
    this.baseActivity = (BaseActivity) context;
    utilitySingleton = UtilitySingleton.getInstance(context);
    this.mode = mode;
    if(message != null)
        defaultMessage = message;
    if(v != null) {
        this.v = v;
        v.setClickable(true);
    }
    if (showProgress)
    {
        StartProgress(defaultMessage);
    }
}

@Override
public void failure(RetrofitError error)
{
    StopProgress();
    if (error.getKind() == RetrofitError.Kind.NETWORK) {
        utilitySingleton.ShowSnackBar("No network connection", (Context) baseActivity);
    }
    if (restCallback != null)
        restCallback.onFailure(error, mode);
}

@Override
public void success(T model, Response arg1)
{
    StopProgress();
    ShowLog(model, arg1);
    if (restCallback != null)
        restCallback.onSuccess(model, arg1, mode);
}

private void ShowLog(T model, Response arg1)
{
    String body = UtilitySingleton.getInstance(baseActivity).getResponse(arg1);
    RestLog.l(this, "URL==> " + arg1.getUrl());
    RestLog.l(this, (body.equalsIgnoreCase("null")) ? "Model==> " + new GsonBuilder().setPrettyPrinting().create().toJson(model)
            : "Body==> " + body);
}

public void StartProgress(String message)
{
    mProgressHUD = ProgressHUD.show(baseActivity, defaultMessage, true, false, null);
}

public  void StopProgress()
{
    if (mProgressHUD != null && mProgressHUD.isShowing())
    {
        mProgressHUD.dismiss();
    }
}

}