package com.kevin.multitypeadapter.adapter.holder;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kevin.multitypeadapter.R;
import com.kevin.multitypeadapter.adapter.model.Normal;
import com.kevin.multitypeadapterlib.holder.CommonViewHolder;

/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2017/img_1/13 0013
 * Time:下午 3:53
 * Email:KevinLeeV@163.com
 */

public class NormalViewHolder extends CommonViewHolder<Normal> {

    private NormalViewHolder(Context context, View itemView, Typeface tf) {
        super(context, itemView, tf);
    }

    public static NormalViewHolder getInstance(Context context, ViewGroup parent, int layoutId, Typeface tf) {

        View view = LayoutInflater.from(context).inflate(layoutId, parent, false);
        return new NormalViewHolder(context, view, tf);
    }

    @Override
    public void setUpView(Normal model, int position, RecyclerView.Adapter<CommonViewHolder> adapter) {
        setText(R.id.normal_title,model.getText());
        setImageResource(R.id.iv,model.getImageResource());
    }


}
