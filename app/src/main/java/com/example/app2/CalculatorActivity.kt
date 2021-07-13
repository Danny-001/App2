package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_intent.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_add.setOnClickListener {

            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                txt_answer.text = "Please fill in all the details"
            } else {
                var answer = num1.toDouble() + num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }

        btn_subtraction.setOnClickListener {

            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                txt_answer.text = "Please input numbers"
            } else {
                var answer = num1.toDouble() - num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }



        btn_multiplication.setOnClickListener {

            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                txt_answer.text = "Please input numbers"
            } else {
                var answer = num1.toDouble() * num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }

        btn_division.setOnClickListener {

            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

            if (num1.isEmpty() or num2.isEmpty()) {
                txt_answer.text = "Please input numbers"
            } else {
                var answer = num1.toDouble() / num2.toDouble()
                txt_answer.text = answer.toString()
            }

        }
    }
}

