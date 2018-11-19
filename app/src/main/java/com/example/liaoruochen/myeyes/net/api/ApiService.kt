package com.example.liaoruochen.myeyes.net.api

import com.example.liaoruochen.myeyes.net.bean.Categories
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    //获取首页分类
    @GET("/api/v4/categories")
    fun categories(): Observable<List<Categories>>



}