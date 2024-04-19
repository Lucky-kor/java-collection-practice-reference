package com.choongang;

import java.util.ArrayList;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        int total = 0;
        if (arrayList.size() == 0) {
            return 0;
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            total += next;
        }
        return total;
    }
}
