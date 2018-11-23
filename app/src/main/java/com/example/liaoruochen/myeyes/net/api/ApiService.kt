package com.example.liaoruochen.myeyes.net.api

import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.net.bean.Result
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiService {

    /**
     * 获取首页分页
     */
    @GET("/api/v4/categories")
    fun getCategories(): Observable<List<Category>>



    @GET("api/v5/index/tab/category/{id}")
    fun getCategoryContentById(@Path("id") id:Int,
                               @Query("start")startIndex:Int,
                               @Query("num") num :Int,
                               @QueryMap map :HashMap<String,String>):Observable<Result>



}