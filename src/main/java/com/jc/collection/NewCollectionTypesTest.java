package com.jc.collection;

import com.google.common.collect.*;
import sun.security.provider.certpath.Vertex;

import java.util.List;

/**
 * Created by jiangchen on 2018/5/8.
 */
public class NewCollectionTypesTest {
    public static void main(String[] args) {

        // MultiMap
//        ArrayListMultimap<Object, Object> oArrayListMultimap = ArrayListMultimap.create();
//        oArrayListMultimap.put("销售部", "张三");
//        oArrayListMultimap.put("销售部", "李四");
//        oArrayListMultimap.put("技术部", "王五");
//
//        List<Object> techDeptList = oArrayListMultimap.get("技术部");
//        System.out.println(techDeptList);

        // BiMap
//        BiMap<String, Integer> studentMap = HashBiMap.create();
//        studentMap.put("张三", 1001);
//        studentMap.put("李四", 1002);
//        studentMap.put("王五", 1003);
//
//        System.out.println(studentMap.get("张三"));
//        System.out.println(studentMap.inverse().get(1001));

        // Table
//        Table<String, String, String> weightedGraph = HashBasedTable.create();
//        weightedGraph.put("row1", "column1", "value1");
//        weightedGraph.put("row1", "column2", "value2");
//
//        String tableValue = weightedGraph.get("row1", "column2");
//        System.out.println(tableValue);

        // ClassToInstanceMap
//        ClassToInstanceMap<String> numberDefaults = MutableClassToInstanceMap.create();
//        numberDefaults.putInstance(String.class, "Test");

        // RangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.open(1, 10), "foo");
        System.out.println(rangeMap);
    }
}
