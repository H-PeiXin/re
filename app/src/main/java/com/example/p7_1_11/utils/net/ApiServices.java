package com.example.p7_1_11.utils.net;


import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiServices {
    @GET
    Observable<ResponseBody> get(@Url String url);
}
