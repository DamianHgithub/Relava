package com.example.relava.feature.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.relava.R
import com.example.relava.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupFragment()
    }
    private fun setupFragment() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, LoginFragment())
            addToBackStack("LoginFragment")
            commit()
        }
    }
    private fun changeFragment() {
        when (currentFragment()) {
            "LoginFragment" -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, RegisterFragment())
                    addToBackStack("RegisterFragment")
                    commit()
                }
            }
            "RegisterFragment" -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container, LoginFragment())
                    addToBackStack("LoginFragment")
                    commit()
                }
            }
        }
    }
    private fun currentFragment(): String {
        val entries = supportFragmentManager.backStackEntryCount
        return supportFragmentManager.getBackStackEntryAt(entries - 1).name!!
    }
}