package com.dgarcia.template.routing

import androidx.fragment.app.FragmentActivity
import com.dgarcia.template.R
import com.dgarcia.template.common.extensions.showFragment
import com.dgarcia.template.ui.weather.view.fragments.WeatherDetailsFragment

/**
 * Every activity that holds fragments should name its container "fragmentContainer"
 */

class AppFragmentNavigator(private val activity: FragmentActivity) : FragmentNavigator {
  
  override fun showWeatherDetails() = activity.showFragment(WeatherDetailsFragment.newInstance(), R.id.fragmentContainer, true)
}

