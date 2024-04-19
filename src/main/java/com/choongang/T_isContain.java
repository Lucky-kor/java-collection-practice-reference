package com.choongang;

import java.util.HashMap;

public class T_isContain {
    public boolean isContain(HashMap<String, Integer> hashMap, String key) {
        return hashMap.containsKey(key);
    }
}
