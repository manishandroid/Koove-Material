package com.koove.retrofit;

import com.koove.MyApplication;
import com.koove.koovematerial.Model.ResponseModel;

import java.util.ArrayList;
import java.util.HashMap;
import retrofit.client.Response;

/**
 * Created by Manish on 10/19/2015.
 */
public class RetrofitRequest {

    private static RestService restService = MyApplication.getRestAdapter().create(RestService.class);

    public static void getPost(MyCallback<ArrayList<ResponseModel>> cb) {
        restService.getPost(cb);
    }
}
