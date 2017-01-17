package com.kevin.multitypeadapter.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.kevin.multitypeadapter.adapter.type.TypeFactoryForList;
import com.kevin.multitypeadapterlib.holder.CommonViewHolder;
import com.kevin.multitypeadapterlib.model.Visitable;
import com.kevin.multitypeadapterlib.type.TypeFactoryParent;

import java.util.List;


/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2016/12/15 0015
 * Time:下午 6:23
 * Email:KevinLeeV@163.com
 */
public class MultiItemTypeAdapter extends RecyclerView.Adapter<CommonViewHolder> {

    private List<Visitable> datas;
    private Typeface typeface;
    private TypeFactoryParent typeFactory;

    public MultiItemTypeAdapter(List<Visitable> list) {
        this.datas = list;
        this.typeFactory = new TypeFactoryForList();
    }

    public void setTypeFace(Typeface tf) {
        this.typeface = tf;
    }

    @Override
    public int getItemCount() {
        if (datas != null && datas.size() > 0)
            return datas.size();
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return datas.get(position).type(typeFactory);
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        return typeFactory.createViewHolder(context, parent, viewType, typeface);
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
        holder.setUpView(datas.get(position), position, this);
    }

}
