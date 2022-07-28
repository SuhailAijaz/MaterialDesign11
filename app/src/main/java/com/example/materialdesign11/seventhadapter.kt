package com.example.materialdesign11

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class seventhadapter ():RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
return seventhViewHolder(LayoutInflater.from(parent.context)
    .inflate(R.layout.seventhrowxml,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is seventhViewHolder){

        }

    }

    override fun getItemCount(): Int {
return 10
    }
}