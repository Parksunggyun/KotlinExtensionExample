package com.example.kotlinextensionexample

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_kotlin.view.*
import java.util.*

class MainAdapter(private val activity: Activity) : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    var titles = Vector<String>()
    private val context = activity.applicationContext

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(parent)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.itemView.titleTxtView.text = titles[position]
    }



    override fun getItemCount(): Int {
        return titles.size
    }

    fun update(titles: Vector<String>) {
        this.titles = titles
        notifyDataSetChanged()
    }

    inner class MainHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_kotlin, parent, false))
}