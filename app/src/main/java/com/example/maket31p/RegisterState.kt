package com.example.maket31p

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class RegisterState : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_state)
       // forTextChanged()
        init()
    }
   @RequiresApi(Build.VERSION_CODES.M)
   fun init()
    {
        var fullName = findViewById<EditText>(R.id.editTextTextPersonNames)
        var login = findViewById<EditText>(R.id.editTextTextEmail)
        var password = findViewById<EditText>(R.id.editTextTextPasswordS)
        var passwordSecond = findViewById<EditText>(R.id.editTextTextPasswordSecond)
        var btnRester = findViewById<Button>(R.id.buttonRegister)


        btnRester.setOnClickListener()
        {
            if(password.text.toString()==passwordSecond.text.toString())
            {
                Toast.makeText(this,"Correct",
                    Toast.LENGTH_LONG).show()
                startActivity(Intent(this@RegisterState,CongrastActivity::class.java))
            }
            else
            {
                Toast.makeText(this,"Un correct",
                    Toast.LENGTH_LONG).show()
            }
        }


        if(login.text.length>0&&password.text.length>0&&fullName.text.length>0&&passwordSecond.text.length>0)
        {
            btnRester.setTextColor(this@RegisterState.getColor(R.color.white))
            btnRester.background = this@RegisterState.getDrawable(R.drawable.backgroun_text_btn_activity)

        }
        if(login.text.length==0||password.text.length==0||fullName.text.length==0||passwordSecond.text.length==0)
        {
            btnRester.setTextColor(this@RegisterState.getColor(R.color.textColor))
            btnRester.background = this@RegisterState.getDrawable(R.drawable.background_text_btn)

        }
    }
    fun forTextChanged() {
        var fullName = findViewById<EditText>(R.id.editTextTextPersonNames)
        var login = findViewById<EditText>(R.id.editTextTextEmail)
        var password = findViewById<EditText>(R.id.editTextTextPasswordS)
        var passwordSecond = findViewById<EditText>(R.id.editTextTextPasswordSecond)
        var btnRester = findViewById<Button>(R.id.buttonRegister)

        login.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(login.text.length>0&&password.text.length>0&&fullName.text.length>0&&passwordSecond.text.length>0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.white))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0||fullName.text.length==0||passwordSecond.text.length==0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.textColor))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.background_text_btn)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
        fullName.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(login.text.length>0&&password.text.length>0&&fullName.text.length>0&&passwordSecond.text.length>0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.white))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0||fullName.text.length==0||passwordSecond.text.length==0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.textColor))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.background_text_btn)

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
                if(login.text.length>0&&password.text.length>0&&fullName.text.length>0&&passwordSecond.text.length>0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.white))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0||fullName.text.length==0||passwordSecond.text.length==0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.textColor))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.background_text_btn)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
        passwordSecond.addTextChangedListener(object : TextWatcher
        {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if(login.text.length>0&&password.text.length>0&&fullName.text.length>0&&passwordSecond.text.length>0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.white))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.backgroun_text_btn_activity)

                }
                if(login.text.length==0||password.text.length==0||fullName.text.length==0||passwordSecond.text.length==0)
                {
                    btnRester.setTextColor(this@RegisterState.getColor(R.color.textColor))
                    btnRester.background = this@RegisterState.getDrawable(R.drawable.background_text_btn)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })





    }
}