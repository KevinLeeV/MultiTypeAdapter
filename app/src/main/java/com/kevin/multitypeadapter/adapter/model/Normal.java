package com.kevin.multitypeadapter.adapter.model;


import com.kevin.multitypeadapter.adapter.type.TypeFactory;
import com.kevin.multitypeadapterlib.model.Visitable;

public class Normal implements Visitable<TypeFactory> {

    String text;

    public Normal(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    int imageResource;

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
