package com.example.aboutmeproject

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.inputmethod.InputMethodManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickname(it)
        }


    }
    private fun addNickname(view:View){
        val editText = findViewById<EditText>(R.id.nickName_edit)
        val nickNameTextView = findViewById<TextView>(R.id.nickName_text)
        nickNameTextView.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE
        nickNameTextView.visibility=View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}