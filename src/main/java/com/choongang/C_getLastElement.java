package com.choongang;

import java.util.ArrayList;

public class C_getLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        // 주의 사항 : 빈 ArrayList를 입력받은 경우, null을 리턴해야 합니다.
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }
}
