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


    /**
     * 根据id获取对应分类内容
     */
    @GET("api/v5/index/tab/category/{id}")
    fun getCategoryContentById(@Path("id") id:Int,
                               @Query("start")startIndex:Int,
                               @Query("num") num :Int,
                               @QueryMap map :HashMap<String,String>):Observable<Result>


    //首页-发现
    @GET("api/v5/index/tab/discovery")
    fun getDisoveryContent(): Observable<Result>


    //首页-推荐
    @GET("api/v5/index/tab/allRec")
    fun allRec(@Query("page") page: Int): Observable<Result>

    //首页-日报
    /**
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v5/index/tab/feed?date=1516842000000&num=1
     */
    @GET("api/v5/index/tab/feed")
    fun feed(@Query("date") date: Long,
             @Query("num") num: Int): Observable<Result>


}