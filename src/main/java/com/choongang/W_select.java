package com.choongang;

import java.util.HashMap;

public class W_select {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> newHashMap = new HashMap<>();
        for (String el : arr) {
            if (hashMap.containsKey(el)) {
                newHashMap.put(el, hashMap.get(el));
            }
        }
        return newHashMap;
    }
}
