package com.example.newsappforschool

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("api/catsports")
    fun getSportPosts(): Call<MutableList<NewsPostModel>>

    @GET("api/nutsnutelafunews")
    fun getHomePosts(): Call<MutableList<NewsPostModel>>

    @GET("api/catworld")
    fun getWorldPosts(): Call<MutableList<NewsPostModel>>

    @GET("api/catpolitics")
    fun getPoliticsPosts(): Call<MutableList<NewsPostModel>>

    @GET("api/catlatest")
    fun getLatestPosts(): Call<MutableList<NewsPostModel>>

    @GET("api/cateconomy")
    fun getEconomyPosts(): Call<MutableList<NewsPostModel>>

}