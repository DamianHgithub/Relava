package com.example.relava.feature.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.relava.R
import com.example.relava.databinding.FragmentRegisterBinding

class RegisterFragment: Fragment(R.layout.fragment_register) {
    private lateinit var binding: FragmentRegisterBinding
    private lateinit var authActivity: AuthActivity
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)
        authActivity = activity as AuthActivity

        setupButtons()
    }
    private fun setupButtons() {
        binding.btnRegister.setOnClickListener {
            if (binding.inputEmail.text.isEmpty()) binding.inputEmail.error =
                resources.getString(R.string.error)
            if (binding.inputPassword.text.isEmpty()) binding.inputPassword.error =
                resources.getString(R.string.error)
            if (binding.inputConfirmPassword.text.isEmpty()) binding.inputConfirmPassword.error =
                resources.getString(R.string.error)
            if (binding.inputEmail.text.isNotEmpty() &&
                binding.inputPassword.text.isNotEmpty() &&
                binding.inputConfirmPassword.text.isNotEmpty() &&
                binding.inputPassword.text.toString() == binding.inputConfirmPassword.text.toString()) {
                // Perform Firebase action
            }
        }
        binding.textLogin.setOnClickListener {
            authActivity.changeFragment()
        }
    }
}