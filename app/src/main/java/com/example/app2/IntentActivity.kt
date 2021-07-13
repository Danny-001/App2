package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.*

class IntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btn_sms.setOnClickListener {

            sendSMS("0715890924" , "How is your day?")
        }

        btn_stk.setOnClickListener {

            val simToolKitLaunchIntent = this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if (simToolKitLaunchIntent !=null){
                startActivity(simToolKitLaunchIntent)
            }
        }

        btn_email.setOnClickListener {

            email("dankiprop97@gmail.com", "Web Application" , "welcome" )
        }

        btn_share.setOnClickListener {

            share("Welcome to class")
        }

        btn_call.setOnClickListener {

            makeCall("0715890924")
        }

        btn_browser.setOnClickListener {

            browse("www.w3schools.com")
        }
    }
}
