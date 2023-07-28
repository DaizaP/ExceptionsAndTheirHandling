package com.example.exceptionsandtheirhandling.Seminar1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class t1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        find(arr, 10, 5);
        find(null, 2, 5);
        find( arr, 5, 5);
        find(arr, 3, 10);
    }
    public static int tryArray(int[] arr,int len, int num){
        if (arr == null) {
            return -3;
        }
        if (arr.length < len ){
            return -1;
        }
        return IntStream.range(0, arr.length)
                    .filter(i -> num == arr[i])
                    .findFirst()
                    .orElse(-2);
        }
        public static void find(int[] arr, int len, int num){
            int result = tryArray(arr, len, num);
            switch (result) {
                case -1 -> System.out.println("Массив меньше минимальной длины");
                case -2 -> System.out.println("Число не найдено");
                case -3 -> System.out.println("Переданный массив равен null");
                default -> System.out.println("Число находится под индексом " + result);
            }
        }
    }