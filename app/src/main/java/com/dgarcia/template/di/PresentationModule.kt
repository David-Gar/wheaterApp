package com.dgarcia.template.di

import com.dgarcia.template.ui.weather.presentation.WeatherViewModel
import com.dgarcia.template.ui.welcome.presentation.WelcomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
  viewModel { WeatherViewModel(get()) }
  viewModel { WelcomeViewModel() }
}