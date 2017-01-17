package com.kevin.multitypeadapter.adapter.holder;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kevin.multitypeadapter.R;
import com.kevin.multitypeadapter.adapter.model.One;
import com.kevin.multitypeadapterlib.holder.CommonViewHolder;


/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2017/img_1/13 0013
 * Time:下午 3:53
 * Email:KevinLeeV@163.com
 */

public class OneViewHolder extends CommonViewHolder<One> {

    private OneViewHolder(Context context, View itemView, Typeface tf) {
        super(context, itemView, tf);
    }

    public static OneViewHolder getInstance(Context context, ViewGroup parent, int layoutId, Typeface tf) {

        View view = LayoutInflater.from(context).inflate(layoutId, parent, false);
        return new OneViewHolder(context, view, tf);
    }

    @Override
    public void setUpView(One model, int position, RecyclerView.Adapter<CommonViewHolder> adapter) {
        setText(R.id.one_title,model.getText());
    }


}
