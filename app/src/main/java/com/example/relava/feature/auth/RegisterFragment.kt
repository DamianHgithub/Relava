package com.example.relava.feature.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.relava.R
import com.example.relava.databinding.FragmentRegisterBinding

class RegisterFragment: Fragment(R.layout.fragment_register) {
    private lateinit var binding: FragmentRegisterBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)
    }
}