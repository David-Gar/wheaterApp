package com.dgarcia.template.ui.weather.view.activities

import android.os.Bundle
import com.dgarcia.template.R
import com.dgarcia.template.routing.AppNavigator
import com.dgarcia.template.routing.ScreenType
import com.dgarcia.template.ui.base.BaseActivity
import com.dgarcia.template.ui.weather.view.fragments.WeatherFragment

class WeatherActivity : BaseActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_container)
    when (intent.getSerializableExtra(AppNavigator.SCREEN_TYPE)) {
      ScreenType.WEATHER -> addFragment(WeatherFragment.newInstance(), R.id.fragmentContainer, true)
      else -> finish()
    }
  }
}
