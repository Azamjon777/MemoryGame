package com.example.sql_kesh

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counter = 0
    var pref : SharedPreferences?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref = getSharedPreferences("TABLE", Context.MODE_PRIVATE)
        counter=pref?.getInt("counter", 0)!!
        tvResult.text= counter.toString()
    }

    fun onClickAdd(view: View) {
        counter++
        tvResult.text= counter.toString()
        saveData(counter)
    }

    fun saveData (res:Int){
        val editor = pref?.edit()
        editor?.putInt("counter", res)
        editor?.apply()
    }
    fun deleteAll(){
        val editor = pref?.edit()
        editor?.clear()
        editor?.apply()

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun onClickClear(view: View) {
        deleteAll()
    }
}