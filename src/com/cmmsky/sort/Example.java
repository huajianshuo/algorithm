package com.cmmsky.sort;

/**
 * author: huajian
 * date  : 19-7-18
 * descrption: 排序算法类模板
 */
public class Example {

    public static void sort(Comparable[] a) {

    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
    }
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if(less(a[i],a[i-1]))
                return false;

            return true;
    }

}
