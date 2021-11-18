package com.example.whatsappcloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar

        // Set the action bar title, subtitle and elevation
        actionBar!!.title = "WhatsApp"

        actionBar.elevation = 4.0F
        var adapter = viwpageadapter(supportFragmentManager, lifecycle)

        var viewPager = findViewById(R.id.view_pager) as ViewPager2
        var tablayout = findViewById(R.id.tabs) as TabLayout
        viewPager.setCurrentItem(1)
        /*val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)*/
        viewPager.adapter = adapter
        TabLayoutMediator(tablayout, viewPager) { tab, pos ->
            when (pos) {
                0 -> {
                   /* tab.icon = getDrawable(R.drawable.ic_baseline_photo_camera_24)*/
                    tab.setIcon(R.drawable.ic_camera_alt_black_24dp)
                    val colors = ResourcesCompat.getColorStateList(resources, R.color.tab_icon,resources.newTheme())
                    tab.icon?.apply { DrawableCompat.setTintList(DrawableCompat.wrap(this), colors) }
                }
                1 -> {
                    tab.text = "CHATS"
                }
                2 -> {
                    tab.text = "STATUS"
                }
                3 -> {
                    tab.text = "CALLS"
                }

            }

        }.attach()
        tablayout.getTabAt(1)?.let { tablayout.selectTab(it) }

        /*val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(came(),"Came")
        fragmentAdapter.addFragment(Chats(),"Chats")
        fragmentAdapter.addFragment(Status(),"Status")
        fragmentAdapter.addFragment(Calls(),"Calls")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)*/
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}

