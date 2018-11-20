package net.ukr.vlsv.hw04.adapters


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_sign_item.view.*
import net.ukr.vlsv.hw04.R
import net.ukr.vlsv.hw04.data.SignItem


class RecyclerAdapterSign (private var mDataset: ArrayList<SignItem>) : RecyclerView.Adapter<RecyclerAdapterSign.ViewHolder>() {
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var mTextView: TextView
        var mImage: ImageView
        init {
            mTextView = v.findViewById(R.id.sign_name_tw) as TextView
            mImage    = v.findViewById(R.id.sign_image_iv) as ImageView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_sign_item, parent, false)
            return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mTextView.setText(mDataset[position].itemName)
        holder.mImage.setImageResource(mDataset[position].itemImageId)
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }


    override fun getItemViewType(position: Int): Int
    {
        return 1

    }

//    companion object {
//        private val TAG = "RecyclerAdapter"
//    }

}