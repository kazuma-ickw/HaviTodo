package com.example.ichikawakazuma.havitodo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

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

        val layout: LinearLayout = inflater?.inflate(R.layout.todoview, null) as LinearLayout

        return layout
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}