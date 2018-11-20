package net.ukr.vlsv.hw04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*
import net.ukr.vlsv.hw04.adapters.mainVPAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_vp.adapter = mainVPAdapter(supportFragmentManager)

        main_tl.setupWithViewPager(main_vp)
    }
}
