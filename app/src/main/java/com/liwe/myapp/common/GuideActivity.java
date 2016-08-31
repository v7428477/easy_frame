package com.liwe.myapp.common;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.liwe.myapp.R;
import com.liwe.myapp.base.BaseActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

public class GuideActivity extends BaseActivity {
    List<Map<String, Object>> mData = new ArrayList<Map<String, Object>>();

    @Bind(R.id.mlistview)
    ListView mlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }


    @Override
    public void doBusiness(Context mContext) {
        Map<String, Object> item = new HashMap<String, Object>();
        item.put("name", "1111");
        mData.add(item);


        mlistview.setAdapter(new SimpleAdapter(this, mData,
                android.R.layout.simple_list_item_1, new String[]{
                "name"
        }, new int[]{
                android.R.id.text1
        }));

        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    @Override
    public void resume() {

    }

    @Override
    public void destroy() {

    }
}
