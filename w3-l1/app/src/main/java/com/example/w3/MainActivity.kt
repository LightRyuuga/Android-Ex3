package com.example.w3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_background.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        btnback.setOnClickListener {
            var intent = Intent(this, BackgroundActivity::class.java)
            intent.putExtra("text", textView1.text.toString())
            intent.putExtra("color", textView1.textColors.defaultColor)
            startActivity(intent)
        }
        val anh = intent.getIntExtra("anh",0)
        val text = intent.getStringExtra("text")
        val color = intent.getIntExtra("color", 0)
        btntitle.setOnClickListener {
            var intent = Intent(this, TitleActivity::class.java)
            intent.putExtra("text", textView1.text.toString())
            intent.putExtra("anh", anh)
            startActivity(intent)
        }

        Toast.makeText(this, color.toString(), Toast.LENGTH_LONG).show()
            if(color!=0) {
                textView1.text = text
                textView1.setTextColor(color)
            }
            if(anh!=0) {

                when (anh) {
                    6 -> imageView1.setBackgroundResource(R.drawable.h6)
                    2 -> imageView1.setBackgroundResource(R.drawable.h2)
                    3 -> imageView1.setBackgroundResource(R.drawable.h3)
                    4 -> imageView1.setBackgroundResource(R.drawable.h4)
                    5 -> imageView1.setBackgroundResource(R.drawable.h5)
                    else -> imageView1.setBackgroundResource(R.drawable.h1)
                }
            }
    }
}
