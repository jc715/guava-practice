package com.jc.basicutil;

import com.google.common.base.Throwables;

import java.util.List;

/**
 * Created by jiangchen.
 */
public class ThrowablesTest {
    public static void main(String[] args) throws Exception {
        try {
            List list = null;
            list.add("1");
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, NullPointerException.class);
        }
    }
}
