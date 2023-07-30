package com.example.exceptionsandtheirhandling.Seminar2.Homework;

//Если необходимо, исправьте данный код
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }
//Исправления отмечены "/*цифра*/"
//1. Добавил массив для наглядности
//2. Из-за того, что добавил пункт два начал выдавать ответ: "Infinity".
// Для чисел с плавающей запятой по умолчанию выключен контроль деления на ноль. Добавил его вручную.
//3. Добавил Double.valueOf(intArray[7]), чтобы выводил нормальный ответ при делении не нацело.
//4. Добавил "ArrayIndexOutOfBoundsException | "
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8}; /*1*/
        try {
            int d = 0;
            if (d == 0) {/*2*/
                throw new ArithmeticException("/ by zero");
            }
            double catchedRes1 = Double.valueOf(intArray[7] / d); /*3*/ /*Если убрать, на выходе всегда будет 0 после точки
            (Если, конечно, не учитывать то, что мы в делитель по условиям задачи суём 0.).*/
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { /*4*/
            System.out.println("Catching exception: " + e);
        }
    }
}
