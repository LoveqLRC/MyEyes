package com.example.liaoruochen.myeyes.utilities

object SchedulerUtils {
    fun <T> ioToMain(): IoMainCompose<T> {
        return IoMainCompose()
    }
}