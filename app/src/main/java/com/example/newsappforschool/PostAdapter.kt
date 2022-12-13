package com.example.newsappforschool

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView



class PostAdapter (val newsPostModel: MutableList<NewsPostModel>): RecyclerView.Adapter<PostViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_card, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

        return holder.bindView(newsPostModel[position])
    }

    override fun getItemCount(): Int {
        return newsPostModel.size
    }
}

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvBody: TextView = itemView.findViewById(R.id.tvBody)
    private val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)


    fun bindView ( newsPostModel: NewsPostModel){
        tvTitle.text = newsPostModel.title
        tvBody.text = newsPostModel.description
        tvAuthor.text = newsPostModel.author


        itemView.setOnClickListener {
            val details =  Intent(itemView.context , NewsDetails::class.java)
            details.putExtra("Title Detail", newsPostModel.title)
            details.putExtra("Body Detail", newsPostModel.description)
            details.putExtra("Content Detail", newsPostModel.content)
            details.putExtra("Link", newsPostModel.link)
            details.putExtra("Date", newsPostModel.pubDate)
            details.putExtra("Author",newsPostModel.author)
            details.putExtra("Image",newsPostModel.enclosure.link)

            val detailsGo = itemView.context as AppCompatActivity
            detailsGo.startActivity(details)
        }

    }
}