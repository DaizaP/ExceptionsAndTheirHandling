package com.example.exceptionsandtheirhandling.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class t4 {
    public static void main(String[] args) {
        Integer[] arrNum = new Integer[]{null, 2, null, 4, null, null, 7};/* 0,2,4,5 */
//        Integer[] arrNum = new Integer[]{1, 2, 3, 4, 5, 6, 7};/* 0,2,4,5 */
        checkArray(arrNum);
    }
    public static void checkArray(Integer[] arr){
        List<String> str = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                str.add(String.valueOf(i));
            }
        }
        if (str.size() > 0){
            throw new RuntimeException("Массив имеет значение null в индексах "+ str.toString());
        }
    }
}
