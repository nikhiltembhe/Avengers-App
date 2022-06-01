package com.nikhiltembhe.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {
    var titleName:String? ="Avnegers Contacts"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers)
//        println("onCreate is called")
        if (intent!=null){
            titleName = intent.getStringExtra("Name")
        }
        title = titleName

    }

//    override fun onStart() {
//        super.onStart()
//        println("onStart is called")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        println("onResume is called")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        println("onPause is called")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        println("onStop is called")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        println("onRestart is called")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        println("onDestroy is called")
//    }
//
//
//
//
}