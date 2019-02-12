package com.example.kotlinextensionexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        abcTxtView.text = "코틀린 익스텐션!!!"
        val linearLayoutManager = LinearLayoutManager(this)
        kotExtRecyclerView.layoutManager = linearLayoutManager
        val mainAdapter = MainAdapter(this)
        kotExtRecyclerView.adapter = mainAdapter
        val titles = Vector<String>()
        titles.add("극한 직업")
        titles.add("뺑반")
        titles.add("드래곤 길들이기3")
        titles.add("킹덤")
        titles.add("극한 직업1")
        titles.add("극한 직업2")
        titles.add("극한 직업3")
        titles.add("극한 직업4")
        titles.add("극한 직업5")
        titles.add("극한 직업6")
        titles.add("극한 직업7")
        titles.add("극한 직업7")
        titles.add("극한 직업8")
        titles.add("극한 직업9")
        titles.add("극한 직업6")
        titles.add("극한 직업666")
        titles.add("극한 직업66")
        titles.add("극한 직업5435")
        mainAdapter.update(titles)

    }
}
