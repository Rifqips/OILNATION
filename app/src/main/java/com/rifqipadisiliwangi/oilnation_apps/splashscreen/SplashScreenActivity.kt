package com.rifqipadisiliwangi.oilnation_apps.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.oilnation_apps.R
import com.rifqipadisiliwangi.oilnation_apps.ui.auth.LoginActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        android.os.Handler().postDelayed({
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }, 8000)
    }
}