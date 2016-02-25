package com.example.ichikawakazuma.havitodo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by ichikawakazuma on 2016/02/25.
 */

class TodoFragment() : Fragment() {

    companion object {
        fun newInstance(sectionNumber: Int): TodoFragment {
            Log.d("test", "test")
            val todoFragment: TodoFragment = TodoFragment()
            return todoFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout: View = inflater?.inflate(R.layout.todoview, container, false) as View

        val textView: TextView = layout?.findViewById(R.id.list_title) as TextView
        textView.text = "test"

        return layout
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}