package com.example.myapplication.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.FirstFragment
import com.example.myapplication.fragments.FourthFragment
import com.example.myapplication.fragments.SecondFragment
import com.example.myapplication.fragments.ThirdFragment

class PgAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
            2 -> return ThirdFragment()
            3 -> return FourthFragment()
        }
        return FirstFragment()
    }

}