package com.kevin.multitypeadapter.adapter.type;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;

import com.kevin.multitypeadapter.R;
import com.kevin.multitypeadapter.adapter.holder.NormalViewHolder;
import com.kevin.multitypeadapter.adapter.holder.OneViewHolder;
import com.kevin.multitypeadapter.adapter.model.Normal;
import com.kevin.multitypeadapter.adapter.model.One;
import com.kevin.multitypeadapterlib.holder.CommonViewHolder;

/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2017/1/17 0017
 * Time:下午 12:05
 * Email:KevinLeeV@163.com
 */

public class TypeFactoryForList implements TypeFactory {

    private final int TYPE_RESOURCE_NORMAL = R.layout.layout_item_normal;
    private final int TYPE_RESOURCE_ONE = R.layout.layout_item_one;

    @Override
    public int type(Normal normal) {
        return TYPE_RESOURCE_NORMAL;
    }

    @Override
    public int type(One one) {
        return TYPE_RESOURCE_ONE;
    }

    @Override
    public CommonViewHolder createViewHolder(Context context, ViewGroup parent, int type, Typeface tf) {
        if (TYPE_RESOURCE_NORMAL == type) {
            return NormalViewHolder.getInstance(context, parent, type, tf);
        }else if (TYPE_RESOURCE_ONE == type) {
            return OneViewHolder.getInstance(context, parent, type, tf);
        }
        return null;
    }
}
