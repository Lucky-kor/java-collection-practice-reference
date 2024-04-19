package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        if (arrayList.size() == 0) {
            return null;
        }
        if (index < 0 || index >= arrayList.size()) {
            return null;
        }
        return arrayList.remove(index);
    }
}
