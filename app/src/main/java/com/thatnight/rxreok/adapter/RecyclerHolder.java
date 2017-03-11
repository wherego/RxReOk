package com.thatnight.rxreok.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.thatnight.rxreok.R;
import com.thatnight.rxreok.bean.News;

/**
 * Time:2017.3.11 22:59
 * Created By:ThatNight
 */

public class RecyclerHolder extends BaseViewHolder<News> {

    ImageView mImageView;
    TextView mTitle;
    TextView mTime;

    RecyclerHolder(ViewGroup itemView) {
        super(itemView, R.layout.item_recyclerview);
        mImageView = $(R.id.iv_image);
        mTime = $(R.id.tv_time);
        mTitle = $(R.id.tv_title);
    }

    @Override
    public void setData(News data) {
        mTitle.setText(data.getTitle());
        mTime.setText(data.getCtime());
        Glide.with(getContext())
                .load(data.getPicUrl())
                .asBitmap()
                .override(100, 100)
                .thumbnail(1f)
                .into(mImageView);
    }
}
