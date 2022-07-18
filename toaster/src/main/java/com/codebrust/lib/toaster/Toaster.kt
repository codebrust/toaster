package com.codebrust.lib.toaster

import android.content.Context
import android.widget.Toast

object Toaster {
    fun toast(context: Context?) {
        Toast.makeText(context, "Hello Default", Toast.LENGTH_SHORT).show()
    }
}