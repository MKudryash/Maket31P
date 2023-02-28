package com.example.maket31p

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        forTextChanged()
    }
    fun forTextChanged() {
        var login = findViewById<EditText>(R.id.editTextTextPersonName)
        var password = findViewById<EditText>(R.id.editTextTextPassword)
        var btnLogIn = findViewById<Button>(R.id.buttonLogIn)

        login.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(login.text.length>0&&password.text.length>0)
                {
                    btnLogIn.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnLogIn.background = this@MainActivity.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0)
                {
                    btnLogIn.setTextColor(this@MainActivity.getColor(R.color.textColor))
                    btnLogIn.background = this@MainActivity.getDrawable(R.drawable.backgroun_text_btn)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
        password.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(login.text.length>0&&password.text.length>0)
                {
                    btnLogIn.setTextColor(this@MainActivity.getColor(R.color.white))
                    btnLogIn.background = this@MainActivity.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0)
                {
                    btnLogIn.setTextColor(this@MainActivity.getColor(R.color.textColor))
                    btnLogIn.background = this@MainActivity.getDrawable(R.drawable.backgroun_text_btn)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })



    }
}