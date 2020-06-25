package com.signis.myshareapp

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String?, durasi: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, durasi).show()
}