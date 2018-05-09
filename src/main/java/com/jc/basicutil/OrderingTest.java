package com.jc.basicutil;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangchen.
 */
public class OrderingTest {
    public static void main(String[] args) {
        Ordering<Comparable> naturalOrdering = Ordering.natural();


        List numList = new ArrayList();
        numList.add(5);
        numList.add(3);
        numList.add(7);

        List sortedNumList = naturalOrdering.sortedCopy(numList);
        System.out.println(sortedNumList);
    }
}
