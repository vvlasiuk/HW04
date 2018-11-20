package net.ukr.vlsv.hw04.fragments

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.ukr.vlsv.hw04.R
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_days_week_fragment.*
import net.ukr.vlsv.hw04.adapters.RecyclerAdapter
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_days_week_fragment.view.*

class DaysWeekFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_days_week_fragment, null)
        val daysWeek = ArrayList<String>()
        daysWeek.add("Monday")
        daysWeek.add("Tuesday")
        daysWeek.add("Wednesday")
        daysWeek.add("Thursday")
        daysWeek.add("Friday")
        daysWeek.add("Saturday")
        daysWeek.add("Sunday")

        val recyclerView = view.days_week_rv

        recyclerView.setHasFixedSize(true)                               // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)           // используем linear layout manager
        recyclerView.adapter = RecyclerAdapter(daysWeek)                // создаем адаптер

        return view
    }
 }

