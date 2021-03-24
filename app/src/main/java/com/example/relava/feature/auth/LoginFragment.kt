package com.example.relava.feature.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.relava.R
import com.example.relava.databinding.FragmentLoginBinding
import org.koin.android.viewmodel.ext.android.sharedViewModel

class LoginFragment: Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var authActivity: AuthActivity
    private val vm by sharedViewModel<AuthViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        authActivity = activity as AuthActivity

        setupButtons()
    }
    private fun setupButtons() {
        binding.btnLogin.setOnClickListener {
            if (binding.inputEmail.text.isEmpty()) binding.inputEmail.error =
                resources.getString(R.string.error)
            if (binding.inputPassword.text.isEmpty()) binding.inputPassword.error =
                resources.getString(R.string.error)
            if (binding.inputEmail.text.isNotEmpty() &&
                binding.inputPassword.text.isNotEmpty()) {
                // Firebase login action
            } else binding.inputPassword.error =
                resources.getString(R.string.error)
        }
        binding.textRegister.setOnClickListener {
            authActivity.changeFragment()
        }
    }
}