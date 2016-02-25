package com.example.ichikawakazuma.havitodo

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout

/**
 * Created by ichikawakazuma on 2016/02/20.
 */

class TodoView(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context,attrs,defStyleAttr) {
    init {
        val layout: View = LayoutInflater.from(context).inflate(R.layout.todoview, this)

    }
}