package com.example.exceptionsandtheirhandling.Seminar3.Homework;

import com.example.exceptionsandtheirhandling.Seminar3.Homework.Model.ParsData;
import com.example.exceptionsandtheirhandling.Seminar3.Homework.Presenter.Presenter;
import com.example.exceptionsandtheirhandling.Seminar3.Homework.View.TraceEx.TraceEx;
import com.example.exceptionsandtheirhandling.Seminar3.Homework.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new ParsData(), new View(), new TraceEx());
        presenter.buttonClick();
    }
}
