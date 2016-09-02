package com.liwe.myapp.sample.map.baidu;

import android.content.Context;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.liwe.myapp.R;
import com.liwe.myapp.base.BaseActivity;

import butterknife.Bind;

/**
 * Date： 2016/9/2.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class BaseMapActivity extends BaseActivity {
    @Bind(R.id.bmapView)
    MapView bmapView;

    @Override
    public int bindLayout() {
        return R.layout.activity_map_base;
    }

    @Override
    public void doBusiness(Context mContext) {
        BaiduMap mBaiduMap = bmapView.getMap();
//普通地图
        mBaiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);

//卫星地图
        mBaiduMap.setMapType(BaiduMap.MAP_TYPE_SATELLITE);

//空白地图, 基础地图瓦片将不会被渲染。在地图类型中设置为NONE，将不会使用流量下载基础地图瓦片图层。使用场景：与瓦片图层一起使用，节省流量，提升自定义瓦片图下载速度。
        mBaiduMap.setMapType(BaiduMap.MAP_TYPE_NONE);

        //开启交通图
        mBaiduMap.setTrafficEnabled(true);

        //开启热力图
        mBaiduMap.setBaiduHeatMapEnabled(false);

    }

    @Override
    public void resume() {
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        bmapView.onResume();
    }

    @Override
    public void destroy() {
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        bmapView.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();

        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        bmapView.onPause();
    }

}
