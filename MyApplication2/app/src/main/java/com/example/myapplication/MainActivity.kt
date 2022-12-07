package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapter.PgAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var pager: ViewPager2
private lateinit var tbLayout: TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.view_pager_2)
        tbLayout = findViewById(R.id.tab_Layout)


        val adapter = PgAdapter(this)
        pager.adapter = adapter

        TabLayoutMediator(tbLayout, pager) { tab, position ->
            when (position) {
                0 -> tab.text = "frag1"
                1 -> tab.text = "frag2"
                2 -> tab.text = "frag3"
                3 -> tab.text = "frag4"
            }
        }.attach()

    }
}