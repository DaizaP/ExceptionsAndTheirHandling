package com.example.exceptionsandtheirhandling.Seminar3.Homework.Presenter;

import com.example.exceptionsandtheirhandling.Seminar3.Homework.Model.Parser;
import com.example.exceptionsandtheirhandling.Seminar3.Homework.View.TraceEx.TraceEx;
import com.example.exceptionsandtheirhandling.Seminar3.Homework.View.View;

public class Presenter {
    Parser parser;
    View view;
    TraceEx traceEx;

    public Presenter(Parser p, View v, TraceEx tr){
        this.parser = p;
        this.view = v;
        this.traceEx = tr;
    }
    public void buttonClick(){
        try{
            view.print(
                    parser.parserData(
                            view.getValue(
                                    "Введите ФИО, дату рождения, номер телефона и пол через пробел: ")
                                    .split(" ")
                    )
            );
        } catch (RuntimeException e) {
            view.printConsole(
                    traceEx.trace(e)
            );
        }
    }
}
