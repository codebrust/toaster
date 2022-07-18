package com.codebrust.app.library_publish_with_variants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codebrust.app.library_publish_with_variants.databinding.ActivityMainBinding
import com.codebrust.lib.toaster.Toaster

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.buttonGiveMeaToast.setOnClickListener {
            Toaster.toast(this)
        }
        setContentView(binding.root)
    }
}