package com.example.exceptionsandtheirhandling.Seminar1;

import java.util.stream.Stream;

public class t2 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[][]{{0, 1, 1}, {1, 1, 0}, {1, 0, 1}};
//        Integer[][] arr2 = new Integer[][]{{0, 1}, {1, 2}};
//        Integer[][] arr3 = new Integer[][]{{2, 2, 2}, {2, 1, 2}, {1, 0}};
        System.out.println(sumArr(arr));
//        System.out.println(sumArr(arr2));
//        System.out.println(sumArr(arr3));
    }

    public static int sumArr(Integer[][] arr) {
        examination(arr);
        int summ = 0;
            for (Integer[] anArr : arr) {
                summ += Stream
                        .of(anArr)
                        .mapToInt(s -> s)
                        .sum();
            }
        return summ;
    }

    public static void examinationArr(Integer[][] arr) {
        for (Integer[] anArr : arr) {
            if (anArr.length != arr.length) {
                throw new RuntimeException("Некорректный массив: Кол-во строк должно быть равно кол-ву столбцов");
            }
        }
    }

    public static void examinationNum(Integer[][] arr) {
        for (Integer[] anArr : arr) {
            for (Integer num : anArr) {
                if (num != 0 && num != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }
    }
    public static void examination(Integer[][] arr) {
        examinationArr(arr);
        examinationNum(arr);
    }
}
