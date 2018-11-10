package com.example.liaoruochen.myeyes

import android.app.Application
import com.example.liaoruochen.myeyes.utilities.BUGLY_ID
import com.squareup.leakcanary.LeakCanary
import com.tencent.bugly.crashreport.CrashReport

class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)

        CrashReport.initCrashReport(this, BUGLY_ID, false)

    }


}