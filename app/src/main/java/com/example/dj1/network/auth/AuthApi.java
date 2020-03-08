package com.example.dj1.network.auth;

import com.example.dj1.models.User;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi {
    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
