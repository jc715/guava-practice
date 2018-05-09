package com.jc.collection;

import com.google.common.collect.ForwardingMap;

import java.util.Map;

/**
 * Created by jiangchen on 2018/5/8.
 */
public class CollectionHelpersTest {
    public static void main(String[] args) {
        TestMap oTestMap = new TestMap();
        oTestMap.put("a", "a");
    }

    static class TestMap extends ForwardingMap {

        @Override
        protected Map delegate() {
            return null;
        }

        @Override
        public Object put(Object key, Object value) {
            return super.put(key, value);
        }
    }
}
