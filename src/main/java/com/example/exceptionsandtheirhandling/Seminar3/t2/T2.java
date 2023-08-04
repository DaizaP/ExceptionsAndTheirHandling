package com.example.exceptionsandtheirhandling.Seminar3.t2;

public class T2 {
    public static void main(String[] args) {
        try(Counter counter = new Counter()) {
            counter.add();
            System.out.println(counter.getCount());
            counter.close();
            counter.add();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
