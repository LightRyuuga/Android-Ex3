package com.example.w3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_background.*
import android.widget.Toast

class BackgroundActivity : AppCompatActivity() {
    var anh: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)
        var intent = intent
        val text = intent.getStringExtra("text")
        val color = intent.getIntExtra("color", 0)

        val image = findViewById(R.id.imageView2) as ImageView
        imageView3.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            image.background = imageView3.background
            anh = 1
        }
        imageView4.setOnClickListener {
            image.background = imageView4.background
            anh = 2
        }
        imageView5.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            image.background = imageView5.background
            anh = 3
        }
        imageView6.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            image.background = imageView6.background
            anh = 4
        }
        imageView7.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            image.background = imageView7.background
            anh = 5
        }
        imageView8.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            image.background = imageView8.background
            anh = 6
        }

        //click save background pass title activity
        btnsaveback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("color", color)
            intent.putExtra("anh", anh)
            intent.putExtra("text", text)
            startActivity(intent)

        }

    }
}



