package com.liwe.myapp.common.view.listA_Z;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import com.liwe.myapp.R;

import java.util.List;

/**
 * Date： 2016/9/1.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class CityAdapter extends ArrayAdapter<String> {
    /**
     * 需要渲染的item布局文件
     */
    private int resource;

    public CityAdapter(Context context, int textViewResourceId, List<String> objects) {
        super(context, textViewResourceId, objects);
        resource = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            layout = (LinearLayout) LayoutInflater.from(getContext()).inflate(resource, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        Button name = (Button) layout.findViewById(R.id.tv_city);
        name.setText(getItem(position));
        return layout;
    }
}
