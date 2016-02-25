package com.example.ichikawakazuma.havitodo

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TextView

class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoPagerAdapter: TodoPagerAdapter = TodoPagerAdapter(supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager) as ViewPager
        viewPager.adapter = todoPagerAdapter

        val tabLayout: TabLayout = findViewById(R.id.main_tab) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
//        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        tabLayout.addTab(tabLayout.newTab().setText("Habit"), 0)
        tabLayout.addTab(tabLayout.newTab().setText("Daily"), 1, true)
        tabLayout.addTab(tabLayout.newTab().setText("Config"), 2)
        Log.d("test2", "test2")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
