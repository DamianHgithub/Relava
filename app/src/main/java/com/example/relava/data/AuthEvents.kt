package com.example.relava.data

sealed class AuthEvents {
    object Register: AuthEvents()
    object Login: AuthEvents()
}