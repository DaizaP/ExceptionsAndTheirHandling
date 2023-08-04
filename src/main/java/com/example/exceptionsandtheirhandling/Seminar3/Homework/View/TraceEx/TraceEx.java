package com.example.exceptionsandtheirhandling.Seminar3.Homework.View.TraceEx;

import java.util.Arrays;

public class TraceEx {
    public String trace(Exception e){
        return Arrays.toString(e.getStackTrace()) + "\n" + e.getMessage();
    }
}
