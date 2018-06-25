package com.vidroid.com.br.apps.event.fragments.info


import android.app.ActionBar
import android.app.Activity
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.vidroid.com.br.apps.event.MainActivity

import com.vidroid.com.br.apps.event.R
import kotlinx.android.synthetic.main.custom_toolbar.*
import kotlinx.android.synthetic.main.view_pager.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class InfoFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_info, container, false)

        val name0 = getString(R.string.event)
        val name1 = getString(R.string.travel)
        val name2 = getString(R.string.event)
        val name3 = getString(R.string.settings)

        val names : Array<String> = arrayOf(name0, name1, name2, name3)

        view.viewPager.adapter = MyPagerAdapter((activity as AppCompatActivity).supportFragmentManager, names)
        val tabs = view.findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(view.viewPager)

        return view
    }


}
