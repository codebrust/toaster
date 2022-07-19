package com.codebrust.lib.toaster

import android.content.Context
import android.widget.Toast
import com.codebrust.toaster.BuildConfig

object Toaster {
    fun toast(context: Context?) {
        Toast.makeText(context, BuildConfig.FLAVOR, Toast.LENGTH_SHORT).show()
    }
}