package com.example.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var zarabotok = arrayOf(2020, 31434, 123123123, 123123, 8707)
    var potratil = arrayOf(5367, 3653, 25245, 2452, 252424)
    var result = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val names = resources.getStringArray(R.array.names)
        for ((index, elements) in names.withIndex()) {
            result.add("name = $elements доход = ${zarabotok[index]-potratil[index]}")
            Log.d("MyLog", "статистика ${result[index]}")
        }
    }
}