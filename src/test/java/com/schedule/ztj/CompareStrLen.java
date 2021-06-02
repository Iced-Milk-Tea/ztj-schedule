package com.schedule.ztj;

import java.util.Comparator;

/**
 * @Author Zhangtj
 * @create 2020-08-28 09:39
 */
public class CompareStrLen implements Cloneable, Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i1 = o1.length();
        int i2 = o2.length();
        return i1 == i2 ? 0 : (i1 > i2 ? 1 : -1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
