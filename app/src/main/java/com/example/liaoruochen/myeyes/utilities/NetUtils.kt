package com.example.liaoruochen.myeyes.utilities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

object NetUtils {

    fun isConnected(context: Context): Boolean {
        val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info: NetworkInfo? = connectivity.activeNetworkInfo
        if (info != null && info.isConnected) {
            if (info.state == NetworkInfo.State.CONNECTED) {
                return true
            }
        }
        return false
    }


}