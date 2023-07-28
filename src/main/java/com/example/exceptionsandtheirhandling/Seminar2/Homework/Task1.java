package com.example.exceptionsandtheirhandling.Seminar2.Homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(inputFloatNum());
    }
    public static float inputFloatNum(){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Введите число типа 'float'(x.x): ");
        String floatNum = scanner.next();
        while (!isFloat(floatNum)){
            System.out.println("Некорректное число. Введите повторно: ");
            floatNum = scanner.next();
        }
        return Float.parseFloat(floatNum);
    }
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
