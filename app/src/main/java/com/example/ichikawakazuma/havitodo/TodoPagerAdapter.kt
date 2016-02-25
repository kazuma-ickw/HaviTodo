package com.example.ichikawakazuma.havitodo

import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log

/**
 * Created by ichikawakazuma on 2016/02/25.
 */

class TodoPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(p0: Int): Fragment? {
//        throw UnsupportedOperationException()
        Log.d("getItem", "getItem")
        return TodoFragment.newInstance(sectionNumber = p0 + 1)
    }

    override fun getCount(): Int {
//        throw UnsupportedOperationException()
        return 3
    }
}