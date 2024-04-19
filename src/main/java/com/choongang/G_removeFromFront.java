package com.choongang;

import java.util.ArrayList;

public class G_removeFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.remove(0);
    }
}
