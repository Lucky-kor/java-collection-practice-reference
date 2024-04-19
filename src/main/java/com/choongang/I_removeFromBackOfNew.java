package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }

        ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);

        newArrayList.remove(size - 1);

        return newArrayList;
    }
}
