package com.example.ichikawakazuma.havitodo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

/**
 * Created by ichikawakazuma on 2016/03/01.
 */

class TodoRecyclerViewAdapter(val data: ArrayList<String>) : RecyclerView.Adapter<TodoRecyclerViewAdapter.TodoRecyclerViewHolder>() {

    class TodoRecyclerViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textView: TextView
        init {
            textView = v.findViewById(R.id.list_row_textview) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TodoRecyclerViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_row, parent, false)
        return TodoRecyclerViewHolder(v)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TodoRecyclerViewHolder?, position: Int) {
        val singleData: String = data[position]
        holder?.textView?.text = singleData
    }
}

