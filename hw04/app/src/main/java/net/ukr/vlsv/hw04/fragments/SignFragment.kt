package net.ukr.vlsv.hw04.fragments

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.ukr.vlsv.hw04.R
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sign_fragment.view.*
import net.ukr.vlsv.hw04.SignItemDecoration
import net.ukr.vlsv.hw04.adapters.RecyclerAdapter
import net.ukr.vlsv.hw04.adapters.RecyclerAdapterSign
import net.ukr.vlsv.hw04.data.SignItem
import net.ukr.vlsv.hw04.sign_item
import net.ukr.vlsv.hw04.sign_item.*
import net.ukr.vlsv.hw04.SignItemDecoration.*


class SignFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_sign_fragment, container, false)
        val signs = ArrayList<SignItem>()
        signs.add(SignItem("Aries", R.drawable.oven))
        signs.add(SignItem("Taurus", R.drawable.telec))
        signs.add(SignItem("Gemini", R.drawable.bliznecy))
        signs.add(SignItem("Cancer", R.drawable.rak))
        signs.add(SignItem("Leo", R.drawable.lev))
        signs.add(SignItem("Virgo", R.drawable.deva))
        signs.add(SignItem("Libra", R.drawable.vesy))
        signs.add(SignItem("Scorpio", R.drawable.skorpion))
        signs.add(SignItem("Sagittarius", R.drawable.strelec))
        signs.add(SignItem("Capricorn", R.drawable.kozerog))
        signs.add(SignItem("Aquarius", R.drawable.vodoley))
        signs.add(SignItem("Pisces", R.drawable.ryby))

        val recyclerView = view.sign_rv

        recyclerView.setHasFixedSize(true)                               // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
        recyclerView.layoutManager = GridLayoutManager(context, 3)           // используем linear layout manager
        recyclerView.adapter = RecyclerAdapterSign(signs)                // создаем адаптер
        recyclerView.addItemDecoration(SignItemDecoration(context!!))

        return view
    }
}

