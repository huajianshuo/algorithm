package com.cmmsky.sort;

/**
 * author: huajian
 * date  : 19-7-18
 * descrption: 排序模板父类
 */
public abstract class BaseSort {

    public abstract void sort(Comparable[] a);

    /**
     * 两数之间进行比较
     * @param v
     * @param w
     * @return
     */
    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换，对数组元素进行交换
     * @param a
     * @param i
     * @param j
     */
    protected void exch(Comparable[] a, int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 显示数组元素
     * @param a
     */
    public void show(Comparable[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 是否已经排序
     * @param a
     * @return
     */
    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if(less(a[i],a[i-1]))
                return false;

        return true;
    }
}
