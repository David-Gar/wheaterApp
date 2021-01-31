package com.dgarcia.template.ui.weather.view.fragments

import com.dgarcia.template.R
import com.dgarcia.template.ui.base.BaseFragment

class WeatherDetailsFragment : BaseFragment() {
  
  override fun getLayout() = R.layout.fragment_weather_details
  
  override fun viewReady() {}
  
  companion object {
    fun newInstance() = WeatherDetailsFragment()
  }
}