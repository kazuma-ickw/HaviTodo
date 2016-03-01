package com.example.ichikawakazuma.havitodo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

/**
 * Created by ichikawakazuma on 2016/02/25.
 */

class TodoFragment() : Fragment() {

    var sectionNumber: Int = 0

    companion object {
        fun newInstance(sectionNumber: Int): TodoFragment {
            val todoFragment: TodoFragment = TodoFragment()
            todoFragment.sectionNumber = sectionNumber
            return todoFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout: ViewGroup = inflater?.inflate(R.layout.pager_view, container, false) as ViewGroup

        val textView: TextView = layout?.findViewById(R.id.list_title) as TextView
        textView.text = "test" + sectionNumber.toString()

        Log.d("id", R.id.list_title.toString())
        var todoViewId: Int = R.id.list_title

        var array: ArrayList<String> = arrayListOf("test")

        var views: ArrayList<ViewGroup> = ArrayList<ViewGroup>()

        for (i in 1..sectionNumber) {
            Log.d("loop", i.toString())
            views.add(i - 1, inflater?.inflate(R.layout.todo_view, container, false) as ViewGroup)
            var testTextView: TextView = views.get(i - 1)?.findViewById(R.id.test_title) as TextView
            var recyclerView: RecyclerView = views.get(i - 1)?.findViewById(R.id.recyclerview) as RecyclerView
            var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(container?.context)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = TodoRecyclerViewAdapter(array)
            testTextView.text = "testだよ" + i.toString()
            var testLayoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            Log.d("generatedId", todoViewId.toString())
            todoViewId = View.generateViewId()
            views.get(i - 1).id = todoViewId
            layout.addView(views.get(i - 1), testLayoutParams)
        }

        return layout
    }
}