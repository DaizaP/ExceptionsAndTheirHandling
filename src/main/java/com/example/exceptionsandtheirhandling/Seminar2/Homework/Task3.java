package com.example.exceptionsandtheirhandling.Seminar2.Homework;
//Код, исправьте его там, где требуется
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }

import java.io.FileNotFoundException;

//Исправления отмечены "/*цифра*/"
//1. Почитал, что блок throws Exception не обязателен. Мы и так ловим все ошибки в блоке try-catch
//2. Значение индекса выходило за пределы массива
//3. Переместил блок catch(Throwable ex) на 38 строку. В конец.
//4. Поправил ответ при ловле исключения.
//5. Добавил ArithmeticException т.к. в try потенциально возможно деление на 0.
//6. printSum в текущей реализации никогда не выбросит FileNotFoundException поправил на NullPointerException
public class Task3 {
    public static void main(String[] args) { /*1*/
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[1] = 9; /*2*/
        } catch (NullPointerException ex) { /*3*/
            System.out.println("Значение не может быть null!"); /*4*/
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) { /*5*/
            System.out.println("Нельзя делить на 0!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException { /*6*/
        System.out.println(a + b);
    }

}
