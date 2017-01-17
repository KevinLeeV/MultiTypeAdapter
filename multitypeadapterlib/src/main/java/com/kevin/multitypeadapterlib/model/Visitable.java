package com.kevin.multitypeadapterlib.model;

/**
 * 所有RecyclerView的model的父类
 * 用来定义当前model的类型，实现item多类型的应用
 */

public interface Visitable<T> {
    int type(T t);
}
