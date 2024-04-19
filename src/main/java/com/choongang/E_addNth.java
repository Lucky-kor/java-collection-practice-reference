package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        if (index < 0 || index >= arrayList.size()) {
            return null;
        }
        arrayList.add(index, element);
        return arrayList;
    }
}
