package com.example.exceptionsandtheirhandling.Homework.t1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] numArr = new int[5];
        numArr[6] = 6;
    }

    public static void divisionByZero() {
        int num = 5 / 0;
    }

    public static void numberFormatException() {
        int num = Integer.parseInt("ewq");
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
