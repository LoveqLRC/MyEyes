package com.example.liaoruochen.myeyes.utilities

import android.annotation.SuppressLint
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
    @SuppressLint("CheckResult")
    override fun applyOptions(context: Context, builder: GlideBuilder) {

        val defaultOptions =RequestOptions()
        val activityManager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager
        // Prefer higher quality images unless we're on a low RAM device
        defaultOptions.format(if (activityManager.isLowRamDevice) PREFER_RGB_565 else PREFER_ARGB_8888)
        // Disable hardware bitmaps as they don't play nicely with Palette
        defaultOptions.disallowHardwareConfig()

        builder.setDefaultRequestOptions(defaultOptions)
    }

    override fun isManifestParsingEnabled(): Boolean {
        return false
    }
}