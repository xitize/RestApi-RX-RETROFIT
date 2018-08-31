package com.xitiz.restapi.model;

import com.xitiz.restapi.DelayedResponse;
import com.xitiz.restapi.ListResource;
import com.xitiz.restapi.ListUser;
import com.xitiz.restapi.Register;
import com.xitiz.restapi.SingleResource;
import com.xitiz.restapi.SingleUser;
import com.xitiz.restapi.TokenGen;
import com.xitiz.restapi.User;
import com.xitiz.restapi.UserCreated;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ReqresinService {
    @GET("/api/users")
    Single<ListUser> getUserList(@Query("page") int page);

    @GET("/api/users/{id}")
    Call<SingleUser> getSingleUser(@Path("id") int userId);

    @GET("/api/unknown")
    Call<ListResource> getListResource();

    @GET("/api/unknown/{id}")
    Call<SingleResource> getSingleResource(@Path("id") int id);

    @POST("/api/users")
    Call<UserCreated> createuser(@Body User user);


    @PUT("/api/users/{id}")
    Call<UserCreated> putUpdate(@Path("id") int id, @Body User User);

    @DELETE("/api/users/{id}")
    Call<User> delete(@Path("id") int id);


    @POST("/api/register")
    Call<TokenGen> registerUser(@Body Register register);


    @GET("/api/users")
    Call<DelayedResponse> delayedResponse(@Query("delay") int id);
}
