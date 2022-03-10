package com.rifqipadisiliwangi.oilnation_apps.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rifqipadisiliwangi.oilnation_apps.MainActivity
import com.rifqipadisiliwangi.oilnation_apps.R
import com.rifqipadisiliwangi.oilnation_apps.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignin.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            Toast.makeText(this, "Welcome To OILNATION", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()
        }

        binding.tvCtAccount.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.tvFgAccount.setOnClickListener {
            val intent = Intent(this,ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

    }
}