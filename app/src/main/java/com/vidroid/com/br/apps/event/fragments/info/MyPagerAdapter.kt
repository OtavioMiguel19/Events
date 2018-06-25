package com.vidroid.com.br.apps.event.fragments.info

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

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
            0 -> "Event"
            1 -> "Travel"
            2 -> "About"
            else -> {
                return "Settings"
            }
        }
    }
}