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

        for (i in 1..sectionNumber) {
            Log.d("loop", i.toString())
            var testView: View = inflater?.inflate(R.layout.todo_view, container, false) as View
            var testTextView: TextView = testView?.findViewById(R.id.test_title) as TextView
            testTextView.text = "testだよ" + i.toString()
            var testLayoutParams: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            Log.d("generatedId", todoViewId.toString())
            testLayoutParams.addRule(RelativeLayout.BELOW, todoViewId)
            todoViewId = View.generateViewId()
            testView.id = todoViewId
            layout.addView(testView, testLayoutParams)
        }

        return layout
    }
}