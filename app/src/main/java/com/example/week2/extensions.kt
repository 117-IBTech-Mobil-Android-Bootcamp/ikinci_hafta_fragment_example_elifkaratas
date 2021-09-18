package com.example.week2

import android.app.Activity
import android.content.Context
import android.content.Intent
inline fun <reified T: Activity> Context.startActivity(bundle : Intent.() -> Unit = {}){
    startActivity(Intent(this,T::class.java).apply(bundle))
}
