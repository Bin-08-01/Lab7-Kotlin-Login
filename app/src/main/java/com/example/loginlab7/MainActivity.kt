package com.example.loginlab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var usernameRemember: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLogin: Button = findViewById(R.id.button)
        buttonLogin.setOnClickListener {
            checkLogin()
        }
    }

    private fun checkLogin() {
        val username: EditText = findViewById(R.id.editTextTextPersonName)
        val password: EditText = findViewById(R.id.editTextTextPassword)
        val rememberCheck: CheckBox = findViewById(R.id.checkBox)
        if(username.text.toString() == "VKU" && password.text.toString() == "123"){
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()
            if(rememberCheck.isChecked){
                usernameRemember = username.text.toString()
                username.hint = usernameRemember
            }
        }else{
            Toast.makeText(this, "Login Fail!!!", Toast.LENGTH_SHORT).show()
        }
    }
}