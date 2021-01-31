package com.dgarcia.template.ui.welcome.view

import android.os.Bundle
import com.dgarcia.template.R
import com.dgarcia.template.common.extensions.onClick
import com.dgarcia.template.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_welcome)
    
    nextScreen.onClick {
      appNavigator.showWeatherActivity()
      finish()
    }
  }
}