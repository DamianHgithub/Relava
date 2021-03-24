package com.example.relava.di

import com.example.relava.feature.auth.AuthRepository
import com.example.relava.feature.auth.AuthViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val architectureModule = module {
    single { AuthRepository() }
    viewModel { AuthViewModel(get()) }
}