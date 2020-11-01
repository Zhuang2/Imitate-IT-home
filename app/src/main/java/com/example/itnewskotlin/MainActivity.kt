package com.example.itnewskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var newsList = ArrayList<News>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()  //隐藏标题

        initNews()

        val newsAdapter = NewsAdapter(this,R.layout.news_items,newsList)
        NewsLlstView.adapter=newsAdapter

        NewsLlstView.setOnItemClickListener { _, _, i, _ ->
            val news = newsList[i]

            //跳转至详情页
            val intent= Intent(this,ActivityItems::class.java)
            startActivity(intent)

        }
    }

    fun initNews(){
        repeat(2){
            newsList.add(News("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB",R.drawable.three))
            newsList.add(News("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB",R.drawable.three))
            newsList.add(News("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB",R.drawable.three))
            newsList.add(News("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB",R.drawable.three))
            newsList.add(News("订阅苹果Apple One的用户最大可用的ICloud空间将高达4TB",R.drawable.three))
        }
    }

}