package com.example.liaoruochen.myeyes.ui.fragment.home.category.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.liaoruochen.myeyes.utilities.createMultiViewHolder

class MultiTypeAdapter(list: List<String>, context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var mData = list
    private var mContext = context

    enum class ITEM_TYPE(val type: String) {
        ITEM_TEXT("textContent")
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = createMultiViewHolder(parent,viewType)

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}