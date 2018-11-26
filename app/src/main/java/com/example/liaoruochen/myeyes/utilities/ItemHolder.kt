package com.example.liaoruochen.myeyes.utilities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.fragment.home.category.adapter.MultiTypeAdapter

fun createMultiViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    when (viewType) {
        MultiTypeAdapter.ITEM_TYPE.ITEM_TEXT_CARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_text_card, viewGroup, false)
            return ItemTextCardItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_BRIEFCARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_brief_card, viewGroup, false)
            return ItemBriefCardItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_DYNAMIC_INFOCARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_dynamic_infocard, viewGroup, false)
            return ItemDynamicInfoCardItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_HORICONTAL_SCROLLCARD.type.hashCode() -> {
            val view =
                LayoutInflater.from(viewGroup.context).inflate(R.layout.item_horizontal_scrollcard, viewGroup, false)
            return ItemHorizontalScrollCardHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_FOLLOWCARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_followcard, viewGroup, false)
            return ItemFollowCardItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_VIDEOSMALLCARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_video_smallcard, viewGroup, false)
            return ItemVideoSmallCardHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_SQUARECARD_COLLECTION.type.hashCode() -> {
            val view =
                LayoutInflater.from(viewGroup.context).inflate(R.layout.item_squarecard_collection, viewGroup, false)
            return ItemSquareCardCollectionHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_VIDEOCOLLECTION_WITHBRIEF.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_videocollection_withbrief, viewGroup, false)
            return ItemVideoCollectionWithBriefHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_BANNER.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_banner, viewGroup, false)
            return ItemBannerHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_BANNER2.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_banner2, viewGroup, false)
            return ItemBanner2Holder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_VIDEO.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_followcard, viewGroup, false)
            return ItemVideoItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_VIDEOCOLLECTION_OFHORISCROLLCARD.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_videocollection_ofhoriscroll, viewGroup, false)
            return ItemVideoCollectionOfHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_TEXTHEADER.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_text_header, viewGroup, false)
            return ItemTextHeaderItemHolder(view)
        }
        MultiTypeAdapter.ITEM_TYPE.ITEM_TEXTFOOTER.type.hashCode() -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_text_footer, viewGroup, false)
            return ItemTextFooterItemHolder(view)
        }
        else -> {
            val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_empty, viewGroup, false)
            view.visibility = View.VISIBLE
            return ItemEmptyHolder(view)
        }
    }
}

class ItemEmptyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemTextFooterItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemTextHeaderItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemVideoCollectionOfHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemVideoItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemBanner2Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemBannerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemVideoCollectionWithBriefHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemSquareCardCollectionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemVideoSmallCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemFollowCardItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemHorizontalScrollCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemDynamicInfoCardItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class ItemBriefCardItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}


class ItemTextCardItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}

class CommonTextViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}