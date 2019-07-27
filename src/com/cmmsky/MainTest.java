package com.cmmsky;

import com.cmmsky.sort.algorithm.Insertion;
import com.cmmsky.sort.algorithm.Selection;

/**
 * author: huajian
 * date  : 19-7-18
 * descrption: 主要测试类
 */
public class MainTest {

    public static void main(String[] args) {
        Integer [] a = {9, 3, 4, 6, 5, 7, 8};
        // Selection selection = new Selection();
        // selection.sort(a);
        // selection.show(a);
        Insertion insertion = new Insertion();
        insertion.sort(a);
        insertion.show(a);

    }
}
