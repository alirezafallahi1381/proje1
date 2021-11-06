package com.example.proje1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var tv_name =findViewById<TextView>(R.id.ac_main2_tv_name)

        var bundler:bundle?intent.extras
        tv_name.text="سلام" +"" + bundler!!.get("edt_name").tostring() +"" + bundler!!.get("edt_name").tostring()+"عزیز به سامانه خوش آمدید"
    }
}