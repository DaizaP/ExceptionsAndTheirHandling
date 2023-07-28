package com.example.exceptionsandtheirhandling.Seminar2;

import java.util.Scanner;

//если выкидывает runtime exception нужно менять код или проверять через if ловить его try catch не нужно
public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс массива куда записать значение");
        int index = scanner.nextInt();
        while (index >= arr.length || index < 0) {
            System.out.println("Неккорректный индекс массива. Введите индекс от 0 до " + (arr.length - 1));
            index = scanner.nextInt();
        }
        arr[index] = 1;
    }
}
