package com.example.fun_fact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signIn()


    }

    private fun signIn(){
        val emailAddress = findViewById<TextInputEditText>(R.id.text_input_edit_Email)
        val password = findViewById<TextInputEditText>(R.id.text_input_edit_Password)
        val signInButton = findViewById<MaterialButton>(R.id.btnLogin)

        signInButton.setOnClickListener(){
            if(emailAddress.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email Address or Password isn't provided", Toast.LENGTH_LONG).show()
            }

            else if(emailAddress.text.toString() == "okorie@gmail.com" && password.text.toString() == "2200")
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            else {
                Toast.makeText(this, "Wrong Email Address or Password", Toast.LENGTH_LONG).show()
            }
        }

    }
}