package com.example.aluraandroidkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

//configurar tambem no manifest
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a)!!", Toast.LENGTH_SHORT).show()

        setContentView(R.layout.activity_main)
    }
}