package com.koove.retrofit;


import com.koove.koovematerial.Constants.GlobalVariables;
import com.koove.koovematerial.Model.ResponseModel;

import java.util.ArrayList;

import retrofit.client.Response;
import retrofit.http.GET;

public interface RestService
{	
	@GET(GlobalVariables.GET_POST)
    void getPost(MyCallback<ArrayList<ResponseModel>> callback);
}
