package com.cmmsky.sort.algorithm;

import com.cmmsky.sort.BaseSort;

/**
 * author: huajian
 * date  : 19-7-18
 * descrption: 选择排序算法实现
 */
public class Selection extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++)
                if (less(a[j], a[min]))
                    min = j;
            exch(a, i, min);

        }

    }


}
