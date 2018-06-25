package com.vidroid.com.br.apps.event.fragments.schedule


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.vidroid.com.br.apps.event.R
import kotlinx.android.synthetic.main.view_pager.view.*
import com.vidroid.com.br.apps.event.fragments.schedule.MyPagerAdapter
import com.vidroid.com.br.apps.event.model.Event

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ScheduleFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_schedule, container, false)

        val name0 = getString(R.string.day0)
        val name1 = getString(R.string.day1)
        val name2 = getString(R.string.day2)
        val name3 = getString(R.string.day3)

        val names : Array<String> = arrayOf(name0, name1, name2, name3)

        view.viewPager.adapter = MyPagerAdapter((activity as AppCompatActivity).supportFragmentManager, names)
        val tabs = view.findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(view.viewPager)

        return view
    }


}
