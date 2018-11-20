package net.ukr.vlsv.hw04.fragments

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.ukr.vlsv.hw04.R
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_month_fragment.view.*
import net.ukr.vlsv.hw04.adapters.RecyclerAdapter


class MonthFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_month_fragment, null)
        val months = ArrayList<String>()
        months.add("January")
        months.add("February")
        months.add("March")
        months.add("April")
        months.add("May")
        months.add("June")
        months.add("July")
        months.add("August")
        months.add("September")
        months.add("October")
        months.add("November")
        months.add("December")

        val recyclerView = view.month_rv

        recyclerView.setHasFixedSize(true)                               // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)           // используем linear layout manager
        recyclerView.adapter = RecyclerAdapter(months)                // создаем адаптер

        return view
    }
}

