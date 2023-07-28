package com.example.exceptionsandtheirhandling.Seminar2.Homework;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        System.out.println(inputText());
    }

    public static String inputText() {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        text = scanner.nextLine();
        scanner.close();
        if (text.equals("")) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        return text;
    }
}