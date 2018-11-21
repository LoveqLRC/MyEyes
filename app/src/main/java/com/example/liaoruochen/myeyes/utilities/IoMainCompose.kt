package com.example.liaoruochen.myeyes.utilities

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class IoMainCompose<T>:BaseCompose<T>(Schedulers.io(), AndroidSchedulers.mainThread())