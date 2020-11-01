package com.example.itnewskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityItems:AppCompatActivity() {

    private val newList = ArrayList<NewsItems>()

    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState,)
        setContentView(R.layout.news_content)
        supportActionBar?.hide()

//        val news_title = intent.getStringArrayExtra("title")




    }

//    private fun  getRandomLengthString(string: String):String{
//        val n = (1..20).random()
//        val builder = StringBuilder()
//        repeat(n){
//            builder.append("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB")
//        }
//        return builder.toString()
//    }
}