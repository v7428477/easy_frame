package com.liwe.myapp.common.view.listA_Z;

import java.util.Comparator;

/**
 * Date： 2016/9/1.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class PinyinComparator implements Comparator<CitySortModel> {

    public int compare(CitySortModel o1, CitySortModel o2) {
        //这里主要是用来对ListView里面的数据根据ABCDEFG...来排序
        if (o1.getSortLetters().equals("@")
                || o2.getSortLetters().equals("#")) {
            return -1;
        } else if (o1.getSortLetters().equals("#")
                || o2.getSortLetters().equals("@")) {
            return 1;
        } else {
            return o1.getSortLetters().compareTo(o2.getSortLetters());
        }
    }
}
