package com.example.liaoruochen.myeyes.utilities

import android.content.Context
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.liaoruochen.myeyes.BuildConfig

fun String.log() {
    if (BuildConfig.DEBUG) {
        Log.d(LOG_TAG, this)
    }
}

fun String.toast(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}

fun consume(f: () -> Unit): Boolean {
    f()
    return true
}


fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}