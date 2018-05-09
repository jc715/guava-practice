package com.jc.basicutil;

import com.google.common.base.Optional;
import com.google.common.base.Strings;

/**
 * 用于判断值是否为null
 * Created by jiangchen.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> test = Optional.of("test");
        Optional<String> possible = Optional.fromNullable(null);
        System.out.println(possible.isPresent());
    }
}
