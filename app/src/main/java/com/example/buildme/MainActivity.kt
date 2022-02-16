package com.example.buildme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txt = txt1.text

        button.setOnClickListener {
            if (txt1.text.toString() == "") {
                Toast.makeText(this, "กรุณาใส่ตัวเลข", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("txt1",txt.toString())
                startActivity(intent)
            }
        }


    }
}