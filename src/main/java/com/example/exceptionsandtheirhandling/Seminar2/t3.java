package com.example.exceptionsandtheirhandling.Seminar2;
//Анна=4
//        Елена=5
//        Марина=6
//        Владимир=?
//        Константин=?
//        Иван=4
//        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
//        (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре
//        данных, если сохранено значение "?", заменить его на соответствующее число.
//        Если на каком-то месте встречается символ, отличный от числа или "?", бросить подходящее исключение.
//        Записать в тот же файл данные с замененными символами "?".

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class t3 {
    public static void main(String[] args) {
        writeFromArr(change(readToArr("txt3.txt")), "txt3.txt");

    }
    public static List<String[]> readToArr(String filePath ){
        List<String[]> str = new ArrayList<>();
        try {
            FileReader scanner = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(scanner);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                str.add(line.split("="));
            }
            bufferedReader.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла " + filePath);;
        }
        return str;
    }
    public static List<String[]> change(List<String[]> fileText){
        for (String[] arr: fileText) {
            if (!arr[1].equals("?") && !isNumeric(arr[1])) {
                throw new RuntimeException("Значение не число");
            } else{
                arr[1] = String.valueOf(arr[0].length());
            }

        }
        return fileText;
    }
    public static void writeFromArr(List<String[]> fileText, String filePath ){
        try {
            FileWriter scanner = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(scanner);
            for (String[] text: fileText) {
                bufferedWriter.write(text[0]+ "=" + text[1]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Ошибка при записи файла " + filePath);;
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
