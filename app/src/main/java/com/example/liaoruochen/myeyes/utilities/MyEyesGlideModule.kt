package com.example.liaoruochen.myeyes.utilities

import android.app.ActivityManager
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
import com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565

@GlideModule
class MyEyesGlideModule  :AppGlideModule(){
    override fun applyOptions(context: Context, builder: GlideBuilder) {

        val defaultOptions =RequestOptions()
        var activityManager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager

        defaultOptions.format(if (activityManager.isLowRamDevice) PREFER_RGB_565 else PREFER_ARGB_8888)
        defaultOptions.disallowHardwareConfig()

        builder.setDefaultRequestOptions(defaultOptions)
    }

    override fun isManifestParsingEnabled(): Boolean {
        return false
    }
}