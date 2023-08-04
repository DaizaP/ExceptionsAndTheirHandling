package com.example.exceptionsandtheirhandling.Seminar3.t1;

import java.io.IOException;

public class T1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException("Failed");
    }
}
