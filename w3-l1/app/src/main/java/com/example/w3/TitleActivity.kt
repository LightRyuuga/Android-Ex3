package com.example.w3

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_title.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_background.*
import kotlinx.android.synthetic.main.activity_main.*


class TitleActivity : AppCompatActivity() {
    var color: Int = 0
    var colorkq :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        val intent = intent
        val text = intent.getStringExtra("text")
        val anh = intent.getIntExtra("anh",0)

        var editText = findViewById<EditText>(R.id.editText)
        editText.setText(text)

        val image = findViewById(R.id.imageView9) as ImageView
        imageView10.setOnClickListener {
            image.background = imageView10.background
            color = 10
        }
        imageView11.setOnClickListener {
            image.background = imageView11.background
            color = 11
        }
        imageView12.setOnClickListener {
            image.background = imageView12.background
            color = 12
        }
        imageView13.setOnClickListener {
            image.background = imageView13.background
            color = 13
        }
        imageView14.setOnClickListener {
            image.background = imageView14.background
            color = 14
        }
        imageView15.setOnClickListener {
            image.background = imageView15.background
            color = 15
        }


        btnsavetitle.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            var editText = findViewById<EditText>(R.id.editText)
            colorkq = when(color){
                10->getColor(R.color.colorAccent)
                11->getColor(R.color.Blue)
                12->getColor(R.color.Red)
                13->getColor(R.color.Yellow)
                14->getColor(R.color.Lime)
                else -> getColor(R.color.Black)
            }
            intent.putExtra("color", colorkq)
            intent.putExtra("text", editText.text.toString())
            intent.putExtra("anh", anh)
            startActivity(intent)
        }
    }

}
