package com.liwe.myapp.sample.map.baidu;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.liwe.myapp.R;
import com.liwe.myapp.base.BaseActivity;
import com.liwe.myapp.tools.ToolIntent;
import com.liwe.myapp.tools.ToolSYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;

/**
 * Date： 2016/9/2.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class MapActivity extends BaseActivity {
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
        item.put("name", "BaseMapActivity");
        item.put("description"," 百度 基础地图显示");
        mData.add(item);


        mlistview.setAdapter(new SimpleAdapter(this, mData,
                R.layout.item_guide, new String[]{
                "name","description"
        }, new int[]{
                R.id.item_text,R.id.item_description
        }));

        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Class aClass = Class.forName(ToolSYS.CLURL_MAP_BAIDU + ((TextView) view.findViewById(R.id.item_text)).getText().toString());
                    ToolIntent.ClassToActivity(MapActivity.this, aClass);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

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
