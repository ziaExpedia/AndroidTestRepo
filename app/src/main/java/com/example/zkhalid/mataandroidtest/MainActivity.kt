package com.example.zkhalid.mataandroidtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("hey ther")
    }

    fun doCalculate():String{
        return "happy"
    }
}
