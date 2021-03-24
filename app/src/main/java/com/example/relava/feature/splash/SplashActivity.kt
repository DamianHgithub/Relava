package com.example.relava.feature.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import androidx.lifecycle.lifecycleScope
import com.example.relava.R
import com.example.relava.databinding.ActivitySplashBinding
import com.example.relava.feature.auth.AuthActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashTime = resources.getInteger(R.integer.splash_time).toLong() // 5000
        val intent = Intent(this, AuthActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        }
        binding.root.animate().apply {
            interpolator = AccelerateDecelerateInterpolator()
            alpha(1f)
        }
        lifecycleScope.launch {
            delay(splashTime)
            startActivity(intent)
            finish()
        }
    }
}