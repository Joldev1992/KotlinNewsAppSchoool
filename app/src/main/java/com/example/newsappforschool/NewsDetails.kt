package com.example.newsappforschool

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Spanned
import android.widget.ImageView
import android.widget.TextView

import coil.load

class NewsDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        fun String.toSpanned(): Spanned {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
            } else {
                @Suppress("DEPRECATION")
                return Html.fromHtml(this)
            }
        }

        val titleDetail = intent.getStringExtra("Title Detail")
        val titlesD = findViewById<TextView>(R.id.tvDetailTitleView)
        titlesD.text = titleDetail?.toSpanned()

        val detailBody = intent.getStringExtra("Body Detail")
        val bodyD = findViewById<TextView>(R.id.tvDetailBody)
        bodyD.text = detailBody?.toSpanned()

        val detailContent =intent.getStringExtra("Content Detail")
        val contentD = findViewById<TextView>(R.id.tvDetailContent)
        contentD.text = detailContent?.toSpanned()

        val detailLink = intent.getStringExtra("Link")
        val linkD = findViewById<TextView>(R.id.tvDetailLink)
        linkD.text = detailLink?.toSpanned()

        val dateDetail = intent.getStringExtra("Date")
        val dateD = findViewById<TextView>(R.id.tvDetailPublishDate)
        dateD.text = dateDetail?.toSpanned()

        val authorDetail = intent.getStringExtra("Author")
        val authorD = findViewById<TextView>(R.id.tvDetailAuthor)
        authorD.text = authorDetail?.toSpanned()

        val imageDetail = intent.getStringExtra("Image")
        val imageD = findViewById<ImageView>(R.id.imageViewDetail)
        imageD.load(imageDetail){

        }

    }
}