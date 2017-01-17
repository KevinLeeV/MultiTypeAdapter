package com.kevin.multitypeadapter.adapter.type;

import com.kevin.multitypeadapter.adapter.model.Normal;
import com.kevin.multitypeadapter.adapter.model.One;
import com.kevin.multitypeadapterlib.type.TypeFactoryParent;

/**
 * ClassName:
 * Description:
 * Author:KevinLee
 * Date:2017/1/17 0017
 * Time:下午 12:01
 * Email:KevinLeeV@163.com
 */

public interface TypeFactory extends TypeFactoryParent {

    int type(Normal normal);

    int type(One one);

}
