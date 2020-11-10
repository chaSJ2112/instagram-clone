package com.example.instargram_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instargram_test.been.InstagramBean
import com.example.instargram_test.adapter.InstargramAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 화면에 인스타 instargram_home.xml이 열림
        setContentView(R.layout.instargram_home)

        var instargramBeen1 = InstagramBean()

        instargramBeen1.userName = "차수진"
        instargramBeen1.userImg = R.drawable.youtube_user_1
        instargramBeen1.photoImg = R.drawable.img_content
        instargramBeen1.like = "1,999 좋아요"

        var instargramBeen2 = InstagramBean()

        instargramBeen2.userName = "차수진3"
        instargramBeen2.userImg = R.drawable.youtube_user_1
        instargramBeen2.photoImg = R.drawable.img_content
        instargramBeen2.like = "1,999 좋아요3"


        var instargramBeen3 = InstagramBean()

        instargramBeen3.userName = "차수진"
        instargramBeen3.userImg = R.drawable.youtube_user_1
        instargramBeen3.photoImg = R.drawable.img_content
        instargramBeen3.like = "1,999 좋아요"

        var data = ArrayList<InstagramBean>()
        data.add(instargramBeen1)
        data.add(instargramBeen2)
        data.add(instargramBeen3)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView_instargram)

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //recyclerView.layoutManager = layoutManager
        recyclerView?.setLayoutManager(layoutManager)

        var adapter = InstargramAdapter(data)
        recyclerView.adapter = adapter
    }
}