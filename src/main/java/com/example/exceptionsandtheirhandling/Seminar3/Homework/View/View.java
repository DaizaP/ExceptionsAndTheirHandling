package com.example.exceptionsandtheirhandling.Seminar3.Homework.View;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class View {
    private Scanner in = new Scanner(System.in);

    public String getValue(String title){
        System.out.print(title);
        return in.nextLine();
    }
    public void print(String[] data) throws RuntimeException {
        try (FileWriter fw = new FileWriter(String.format("%s.txt", data[0].toLowerCase())/*Фамилия*/, true)) {
            fw.append(Arrays.toString(data)).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void printConsole(String str){
        System.out.println(str);
    }
}
