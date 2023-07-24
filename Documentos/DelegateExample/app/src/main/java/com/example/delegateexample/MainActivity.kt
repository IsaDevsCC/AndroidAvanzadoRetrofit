package com.example.delegateexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.delegateexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PrintYourName.GiveTheName {

    private lateinit var binder : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
        setUp()
    }

    private fun setUp(){
        binder.btPrint.setOnClickListener {
            setName(binder.etNamePrint.text.toString())
        }
    }

    override fun setName(name: String) {
        binder.tvNameReceive.text = name
    }
}