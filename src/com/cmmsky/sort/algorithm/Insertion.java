package com.cmmsky.sort.algorithm;

import com.cmmsky.sort.BaseSort;

/**
 * author: huajian
 * date  : 19-7-22
 * descrption: 插入排序-将每一个数插入到合适的位置，通过移动其他数据的方式
 */
public class Insertion extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0 && less(a[j],a[j-1]);j--)
                exch(a,j,j-1);

    }


}
