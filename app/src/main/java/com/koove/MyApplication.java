package com.koove;

import android.app.Application;

import com.koove.koovematerial.Constants.GlobalVariables;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class MyApplication extends Application {
    private static MyApplication instance;
    private static RestAdapter restAdapter;

    public static MyApplication getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    /**
     * Method to get the instace of MakeModalVersionDb
     *
     * @return MakeModalVersionDB: returns the helper class for the database.
     */

    public static RestAdapter getRestAdapter() {
        return (restAdapter == null) ? setRestAdaptor() : restAdapter;
    }

    public static RestAdapter setRestAdaptor() {

        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader("App-Name", "LMS Service");
            }
        };

        restAdapter = new RestAdapter.Builder().setEndpoint(GlobalVariables.BASE_URL_CONSTANT).setRequestInterceptor(requestInterceptor)
                .setLogLevel(RestAdapter.LogLevel.FULL).setClient(new OkClient(new OkHttpClient())).build();

        return restAdapter;
    }
}
