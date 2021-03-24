package com.example.relava.feature.auth

import androidx.lifecycle.ViewModel
import com.example.relava.data.AuthEvents

class AuthViewModel(
    val repository: AuthRepository
): ViewModel() {
    fun playEvent(event: AuthEvents) {
        when (event) {
            AuthEvents.Login -> {

            }
            AuthEvents.Register -> {

            }
        }
    }
}