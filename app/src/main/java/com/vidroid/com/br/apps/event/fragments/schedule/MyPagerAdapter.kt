package com.vidroid.com.br.apps.event.fragments.schedule

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.vidroid.com.br.apps.event.fragments.info.EventFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                EventFragment()
            }
            1 -> {
                EventFragment()
            }
            2 -> {
                EventFragment()
            }
            else -> {
                return EventFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Day 0"
            1 -> "Day 1"
            2 -> "Day 2"
            else -> {
                return "Day 3"
            }
        }
    }
}