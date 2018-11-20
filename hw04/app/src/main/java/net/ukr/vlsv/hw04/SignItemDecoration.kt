package net.ukr.vlsv.hw04

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class SignItemDecoration (val context: Context) : RecyclerView.ItemDecoration() {
    companion object {
        private const val LEFT_MARGIN = 45
        private const val TOP_MARGIN = 40
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            left = LEFT_MARGIN
            top = TOP_MARGIN
        }
    }
}

