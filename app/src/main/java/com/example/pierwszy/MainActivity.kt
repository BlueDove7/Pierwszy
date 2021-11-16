package com.example.pierwszy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(this.javaClass.simpleName, "Wlasnie ruszyla")

        var number = 500
        var bedziebrzydo = 2000
        val button: Button = findViewById(R.id.button)
        val textField: TextView = findViewById(R.id.text)

        val karolina = Person(dateOfBirth = Date().time.minus(5))
        val karolina2 = Person(dateOfBirth = Date().time.minus(5))

        textField.text = karolina.dateOfBirth.toString()

        button.setOnClickListener {
            Log.d(this.javaClass.simpleName, "dodano 1, nowa wartość: $number")
            textField.text = number.toString()
            number++
        }
    }

    override fun onDestroy() {

        super.onDestroy()
    }
}