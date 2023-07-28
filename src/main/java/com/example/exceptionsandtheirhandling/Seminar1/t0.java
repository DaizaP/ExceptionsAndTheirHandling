package com.example.exceptionsandtheirhandling.Seminar1;

public class t0 {
    public static void main(String[] args) {
        int[] array = new int[2];
        System.out.println(tryArray(array));
    }
    public static int tryArray(int[] array){
        if (array.length < 3 ){
            return -1;
        }
        return array.length;
    }
}
