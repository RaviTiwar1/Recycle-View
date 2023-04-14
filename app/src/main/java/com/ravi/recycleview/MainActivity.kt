package com.ravi.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var  recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleview)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("India")
        countryNameList.add("United Kingdom")
        countryNameList.add("United States Of America")

        detailsList.add("This is an Indian Flag ")
        detailsList.add("This is an UK Flag ")
        detailsList.add("This is an USA Flag ")

        imageList.add(R.drawable.india)
        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.usa)

        adapter = CountryAdapter(countryNameList,detailsList,imageList,this@MainActivity)

        recyclerView.adapter = adapter

    }
}
