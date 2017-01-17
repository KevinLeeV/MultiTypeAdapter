package com.kevin.multitypeadapterlib.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * ClassName: CommonViewHolder
 * Description: 封装了Item中各种View的类
 * Author:KevinLee
 * Date:2016/11/24 0024
 * Time:上午 11:51
 * Email:KevinLeeV@163.com
 */
public abstract class CommonViewHolder<T> extends RecyclerView.ViewHolder {

    // Item中各种View的集合，SparseArray类似于Map，key是Integer类型，但是效率比Map要高
    private SparseArray<View> mViews;
    private View itemView;
    private Context mContext;
    private Typeface typeface;

    public CommonViewHolder(Context context, View itemView, Typeface tf) {
        super(itemView);
        this.mContext = context;
        this.itemView = itemView;
        mViews = new SparseArray<>();
        typeface = tf;
    }
//
//    public static CommonViewHolder getInstance(Context context, ViewGroup parent, int layoutId, Typeface tf) {
//
//        View view = LayoutInflater.from(context).inflate(layoutId, parent, false);
//        return new CommonViewHolder(context, view, tf);
//    }

    /**
     * 通过view的id获取View
     *
     * @param viewId
     * @return
     */
    public View getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return view;
    }

    /**
     * 为TextView及子类设置文本
     *
     * @param viewId view的id
     * @param text   文本信息
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setText(int viewId, String text) {
        TextView view = (TextView) getView(viewId);
        view.setText(text);
        if (typeface != null) {
            view.setTypeface(typeface);
        }
        return this;
    }

    /**
     * 为TextView及子类设置文本
     *
     * @param viewId   view的id
     * @param stringId 文本id
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setText(int viewId, int stringId) {
        TextView view = (TextView) getView(viewId);
        view.setText(mContext.getResources().getString(stringId));
        if (typeface != null) {
            view.setTypeface(typeface);
        }
        return this;
    }

    /**
     * 为View设置背景图
     *
     * @param viewId view的id
     * @param resId  资源Id
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setBackgroundResource(int viewId, int resId) {
        View view = getView(viewId);
        view.setBackgroundResource(resId);
        return this;
    }

    /**
     * 为View设置背景色
     *
     * @param viewId view的id
     * @param color  颜色
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setBackgroundColor(int viewId, int color) {
        View view = getView(viewId);
        view.setBackgroundColor(color);
        return this;
    }

    /**
     * 为ImageView设置前景图
     *
     * @param viewId view的id
     * @param url    图片地址
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setImageUrl(int viewId, String url) {
        ImageView view = (ImageView) getView(viewId);
        Glide.with(mContext).load(url).skipMemoryCache(true).into(view);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId view的id
     * @param resId  资源Id
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setImageResource(int viewId, int resId) {
        ImageView view = (ImageView) getView(viewId);
        view.setImageResource(resId);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId view的id
     * @param bitmap
     * @return ViewHolder是为了实现链式代码
     */
    public CommonViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
        ImageView view = (ImageView) getView(viewId);
        view.setImageBitmap(bitmap);
        return this;
    }

    /**
     * View的点击事件
     *
     * @param viewId          view的id
     * @param onClickListener 点击事件
     * @return
     */
    public CommonViewHolder setOnClickListener(int viewId, final View.OnClickListener onClickListener) {
        View view = getView(viewId);
        view.setOnClickListener(onClickListener);
        return this;
    }

    /**
     * 设置字体
     *
     * @param typeface
     */
    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public abstract void setUpView(T model, int position, RecyclerView.Adapter<CommonViewHolder> adapter);
}
