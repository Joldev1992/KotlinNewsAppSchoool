package com.example.newsappforschool

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load

class NewsDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)


        val titleDetail = intent.getStringExtra("Title Detail")
        val titlesD = findViewById<TextView>(R.id.tvDetailTitleView)
        titlesD.text = titleDetail

        val detailBody = intent.getStringExtra("Body Detail")
        val bodyD = findViewById<TextView>(R.id.tvDetailBody)
        bodyD.text = detailBody

        val detailContent =intent.getStringExtra("Content Detail")
        val contentD = findViewById<TextView>(R.id.tvDetailContent)
        contentD.text = detailContent

        val detailLink = intent.getStringExtra("Link")
        val linkD = findViewById<TextView>(R.id.tvDetailLink)
        linkD.text = detailLink

        val dateDetail = intent.getStringExtra("Date")
        val dateD = findViewById<TextView>(R.id.tvDetailPublishDate)
        dateD.text = dateDetail

        val authorDetail = intent.getStringExtra("Author")
        val authorD = findViewById<TextView>(R.id.tvDetailAuthor)
        authorD.text = authorDetail

        val imageDetail = intent.getStringExtra("Image")
        val imageD = findViewById<ImageView>(R.id.imageViewDetail)
        imageD.load(imageDetail){

        }

    }
}