package com.example.jetpackdatabindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpackdatabindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var databinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        databinding.buttonHello.setOnClickListener {
            val name:String = databinding.edInput.text.toString()
            databinding.txtResult.text= "Hello "+ name
        }

    }
}