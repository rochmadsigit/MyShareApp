package com.signis.myshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.signis.myshareapp.R
import com.signis.myshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString("user_message")
            msg?.let { showToast(msg) }
            //push to textView ok
            tvUserMessage.text = msg
        }
    }
}
