package com.example.materialdesign11

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class seventhViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val imageview:ImageView
    init {
        imageview=view.findViewById(R.id.image_View)
    }
}