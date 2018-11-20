package net.ukr.vlsv.hw04.adapters


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_day_week_item.view.*
import net.ukr.vlsv.hw04.R


class RecyclerAdapter (private var mDataset: ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта спискаmDataset
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // наш пункт состоит только из одного TextView
        var mTextView: TextView

        init {
            mTextView = v.findViewById(R.id.name_tw) as TextView
//            mTextView = v.name_tw
        }
    }

//     Создает новые views (вызывается layout manager-ом)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        if (viewType == 0) {
//            val v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_count_message, parent, false)
//            return ViewHolder(v)
//        }
//
//        if (viewType == 1) {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_day_week_item, parent, false)
//            // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)
            return ViewHolder(v)
//        }
//        else {
//            val v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_user2_item, parent, false)
//            // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)
//            return ViewHolder(v)
//        }

    }

    // Заменяет контент отдельного view (вызывается layout manager-ом)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
           holder.mTextView.setText(mDataset[position])
    }

    // Возвращает размер данных (вызывается layout manager-ом)
    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun getItemViewType(position: Int): Int
    {
//        if (position == 0) {
//            return 0
//        }
//
//        val ViewType: String = mDataset[position][0]
//        if (ViewType == "1") {return 1}
//
        return 1

    }

    companion object {
        private val TAG = "RecyclerAdapter"
    }

}