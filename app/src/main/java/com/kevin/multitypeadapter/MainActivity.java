package com.kevin.multitypeadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kevin.multitypeadapter.adapter.MultiItemTypeAdapter;
import com.kevin.multitypeadapter.adapter.model.Normal;
import com.kevin.multitypeadapter.adapter.model.One;
import com.kevin.multitypeadapterlib.model.Visitable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<Visitable> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
    }

    /**
     * 初始化View
     */
    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
    }

    /**
     * 初始化数据
     */
    private void initData() {

        for (int i = 0; i < 60; i++) {
            if (i % 2 == 0) {
                Normal normal = new Normal("The type is normal..." + i);
                normal.setImageResource(R.drawable.img_1);
                datas.add(normal);
                continue;
            }
            One one = new One();
            one.setText("The type is one..." + i);
            datas.add(one);
        }

        MultiItemTypeAdapter adapter = new MultiItemTypeAdapter(datas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

    }

}
