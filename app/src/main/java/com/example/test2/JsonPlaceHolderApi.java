package com.example.test2;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId")Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );
    @GET("posts")
    Call<List<Post>> getPosts(
            @QueryMap Map<String, String> parameters);

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();

    @GET
    Call<List<Comment>> getComments(@Url String url);
}
