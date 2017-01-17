package com.kevin.multitypeadapterlib.type;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;

import com.kevin.multitypeadapterlib.holder.CommonViewHolder;


/**
 * 布局的类型
 */

public interface TypeFactoryParent {

    CommonViewHolder createViewHolder(Context context, ViewGroup parent, int type, Typeface tf);
}
