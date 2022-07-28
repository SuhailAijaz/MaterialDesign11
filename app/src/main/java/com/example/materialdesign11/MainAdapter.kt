package com.example.materialdesign11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class MainAdapter():RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val madapter by lazy {
        seventhadapter()
    }
    companion object{
        const val one=1
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
return seventhViewHolder(LayoutInflater.from(parent.context)
    .inflate(R.layout.seventhrxyl,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
return 10
    }
    inner class seventhViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        private val recyclerView: RecyclerView
        private val madapter by lazy {
            seventhadapter()
        }
        private val snapHelper = PagerSnapHelper()

        init {
            recyclerView = itemview.findViewById(R.id.rxycl)

            recyclerView.apply {
                snapHelper.attachToRecyclerView(this)
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = madapter
            }
        }
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}