package com.example.liaoruochen.myeyes

import android.app.Application
import android.content.Context
import com.example.liaoruochen.myeyes.utilities.BUGLY_ID
import com.squareup.leakcanary.LeakCanary
import com.tencent.bugly.crashreport.CrashReport
import kotlin.properties.Delegates

class MyApplication : Application() {

    companion object {
        var context: Context by Delegates.notNull()
            private set
    }

    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)

        CrashReport.initCrashReport(this, BUGLY_ID, false)

        context = applicationContext
    }


}