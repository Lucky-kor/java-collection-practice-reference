package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;

public class J_arrayToArrayList {
    public ArrayList<String> arrayToArrayList(String[] arr) {
        // 빈 배열을 입력받은 경우 null을 리턴하세요.
        if (arr.length == 0) {
            return null;
        }

        return new ArrayList<String>(Arrays.asList(arr));
    }
}
