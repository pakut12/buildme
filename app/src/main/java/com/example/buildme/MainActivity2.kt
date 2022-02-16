package com.example.buildme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val c = intent
        var a = c.getStringExtra("txt1")
        var n = 1

        var arr = arrayOf(
            (a.toString().toInt() * 1),
            (a.toString().toInt() * 2),
            (a.toString().toInt() * 3),
            (a.toString().toInt() * 4),
            (a.toString().toInt() * 5),
            (a.toString().toInt() * 6),
            (a.toString().toInt() * 7),
            (a.toString().toInt() * 8),
            (a.toString().toInt() * 9),
            (a.toString().toInt() * 10),
            (a.toString().toInt() * 11),
            (a.toString().toInt() * 12),
        )

        ed1.setText(arr[0].toString())
        ed2.setText(arr[1].toString())
        ed3.setText(arr[2].toString())
        ed4.setText(arr[3].toString())
        ed5.setText(arr[4].toString())
        ed6.setText(arr[5].toString())
        ed7.setText(arr[6].toString())
        ed8.setText(arr[7].toString())
        ed9.setText(arr[8].toString())
        ed10.setText(arr[9].toString())
        ed11.setText(arr[10].toString())
        ed12.setText(arr[11].toString())



        txt1.setText(a)
        txt2.setText(a)
        txt3.setText(a)
        txt4.setText(a)
        txt5.setText(a)
        txt6.setText(a)
        txt7.setText(a)
        txt8.setText(a)
        txt9.setText(a)
        txt10.setText(a)
        txt11.setText(a)
        txt12.setText(a)

        button3.setOnClickListener {
            val x = Intent(this, MainActivity::class.java)
            startActivity(x)
        }


    }
}