package com.example.newsappforschool

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class homefragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Return the fragment view/layout
        val recyclerView = inflater!!.inflate(R.layout.recycler, container, false)

        val serviceGenerator = ServiceGenerator.buildService(ApiService::class.java)
        val call = serviceGenerator.getHomePosts()

        call.enqueue(object : Callback<MutableList<NewsPostModel>> {
            override fun onResponse(
                call: Call<MutableList<NewsPostModel>>,
                response: Response<MutableList<NewsPostModel>>
            ) {

                if (response.isSuccessful) {
                    val result = response.body()
                    result.apply {
                        val layoutMAdap = result?.let { PostAdapter(it) }
                        val recycleById=
                            recyclerView.findViewById<RecyclerView>(R.id.myRecyclerViewId)

                        recycleById?.layoutManager = LinearLayoutManager(context)
                        recycleById?.adapter = layoutMAdap

                    }
                }

            }

            override fun onFailure(call: Call<MutableList<NewsPostModel>>, t: Throwable) {
                t.printStackTrace()
                Log.e("Error", t.message.toString())

            }
        })
        return recyclerView
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }
}