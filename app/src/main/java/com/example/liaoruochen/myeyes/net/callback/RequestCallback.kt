package com.example.liaoruochen.myeyes.net.callback

interface RequestCallback<T> {
    fun requestComplete()
    fun requestError(e: Throwable?)
    fun requestSuccess(t:T)
}