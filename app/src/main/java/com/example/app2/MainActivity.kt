package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calc.setOnClickListener {

            val intent= Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }

        btn_intent.setOnClickListener {

            val intent = Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

        btn_web.setOnClickListener {

            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }










    }
}
