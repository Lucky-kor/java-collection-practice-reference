package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // 주의 사항 : 빈 ArrayList를 입력받은 경우, null을 리턴해야 합니다.
        // 주의 사항 : ArrayList의 크기를 벗어나는 수를 입력받은 경우, null을 리턴해야 합니다.
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        return arrayList.get(index);
    }
}
