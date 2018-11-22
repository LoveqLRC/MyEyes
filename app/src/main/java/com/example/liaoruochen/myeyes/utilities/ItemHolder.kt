package com.example.liaoruochen.myeyes.utilities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.liaoruochen.myeyes.R


import com.example.liaoruochen.myeyes.ui.fragment.home.category.adapter.MultiTypeAdapter.ITEM_TYPE.ITEM_TEXT

fun createMultiViewHolder(viewGroup:ViewGroup,viewType:Int):RecyclerView.ViewHolder{
    when (viewType) {
        ITEM_TEXT.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_common_text, viewGroup, false)
            return CommonTextViewHolder(view)
        }
        else -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_common_text, viewGroup, false)
            return CommonTextViewHolder(view)
        }
    }
}



class CommonTextViewHolder(view:View) :RecyclerView.ViewHolder(view){

}