package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap<>() always orders the keys in the order 1, 2 , ... or if it is a string starting alphabetically
public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            e.getKey();
            e.getValue();
            result.put(e.getValue(), e.getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        KeyValueSwapper kvw = new KeyValueSwapper();

        Map<Integer, String> sourceMap = new LinkedHashMap<>();
        sourceMap.put(1, "one");
        sourceMap.put(2, "two");
        sourceMap.put(3, "three");
        sourceMap.put(10, "one");

        kvw.swap(sourceMap);

        System.out.println(kvw.swap(sourceMap));
    }
}
