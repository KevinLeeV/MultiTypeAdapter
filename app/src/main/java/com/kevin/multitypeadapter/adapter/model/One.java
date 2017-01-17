package com.kevin.multitypeadapter.adapter.model;

import com.kevin.multitypeadapter.adapter.type.TypeFactory;
import com.kevin.multitypeadapterlib.model.Visitable;

/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2017/1/17 0017
 * Time:下午 1:48
 * Email:KevinLeeV@163.com
 */

public class One implements Visitable<TypeFactory> {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
