package net.ukr.vlsv.hw04.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import net.ukr.vlsv.hw04.fragments.DaysWeekFragment
import net.ukr.vlsv.hw04.fragments.MonthFragment
import net.ukr.vlsv.hw04.fragments.SignFragment

class mainVPAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    companion object {
        const val TABS_NUMBER = 3
    }

    override fun getCount(): Int = TABS_NUMBER

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return DaysWeekFragment()
            1 -> return MonthFragment()
            else -> return SignFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        when (position) {
            0 -> return "Days of the week"
            1 -> return "Months"
            else -> return "Sign"
        }
    }
}