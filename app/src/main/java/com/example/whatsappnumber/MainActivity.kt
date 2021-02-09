package com.example.whatsappnumber

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener{
            val intent = Intent().apply {
                action = Intent.ACTION_VIEW
                `package` = "com.whatsapp"
                data = Uri.parse("http://wa.me/91${editText.text}")
            }
            startActivity(intent)
        }

    }
}