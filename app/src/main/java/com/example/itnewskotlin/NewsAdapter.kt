package com.example.itnewskotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class NewsAdapter(context: Context, private val resource: Int, data: MutableList<News>) :
    ArrayAdapter<News>(context, resource, data) {

    private val resourceId = resource

    inner class ViewHolder(val newsImage:ImageView,val newsTitle:TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder:ViewHolder
        val view:View


        if (convertView == null){
            view = LayoutInflater.from(context).inflate(resourceId,parent,false)
            val newsImage:ImageView = view.findViewById(R.id.newsImage)
            val newsTitle:TextView = view.findViewById(R.id.newsTitle)
            viewHolder = ViewHolder(newsImage,newsTitle)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder=view.tag as ViewHolder
        }

        val news = getItem(position)
        if(news != null){
            viewHolder.newsImage.setImageResource(news.imageID)
            viewHolder.newsTitle.text = news.title
        }
        return view

    }
}