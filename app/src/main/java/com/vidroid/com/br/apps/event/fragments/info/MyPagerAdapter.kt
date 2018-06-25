package com.vidroid.com.br.apps.event.fragments.info

import androidx.core.content.res.TypedArrayUtils.getString
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.vidroid.com.br.apps.event.R

class MyPagerAdapter(fm: FragmentManager, names: Array<String>) : FragmentStatePagerAdapter(fm) {

    val names : Array<String> = names

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                EventFragment()
            }
            1 -> {
                TravelFragment()
            }
            2 -> {
                AboutFragment()
            }
            else -> {
                return SettingsFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {

        return when (position) {
            0 -> names[0]
            1 -> names[1]
            2 -> names[2]
            else -> {
                return names[3]
            }
        }
    }
}