package com.nikhiltembhe.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRgister: TextView
    val validMoblileNo = "8669"
    val validPassword = arrayOf("tony", "steve", "hulk", "black", "thor", "widow")


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btLogIn)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRgister = findViewById(R.id.txtRegister)


//        val mobileNo = etMobileNumber.text.toString()
//        val password = etPassword.text.toString()

        btnLogin.setOnClickListener {
            val mobileNo = etMobileNumber.text.toString()
            val password = etPassword.text.toString()
            var nameOfAvenger = "Avengers"
            val intent = Intent(this@LoginActivity, AvengersActivity::class.java)


            if (mobileNo == validMoblileNo) {
                when (password) {
                    validPassword[0] -> {
                        nameOfAvenger = "Iron Man"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[1] -> {
                        nameOfAvenger = "Captain America"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[2] -> {
                        nameOfAvenger = "Hulk"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[3] -> {
                        nameOfAvenger = "Black Panther"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[4] -> {
                        nameOfAvenger = "Thor"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[5] -> {
                        nameOfAvenger = "Black Widow"
                        intent.putExtra("Name", nameOfAvenger)
                        startActivity(intent)
                    }
                    else -> Toast.makeText(
                        this@LoginActivity,
                        "Wrong Password",
                        Toast.LENGTH_LONG
                    ).show()

                }

            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "You are not registered",
                    Toast.LENGTH_LONG
                ).show()
            }

        }


    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}