package com.example.exceptionsandtheirhandling.Seminar3.t3;

import java.io.FileNotFoundException;

public class NullFileEx extends FileNotFoundException {
    public NullFileEx(String file) {
        super("Файла не существует. Ваш путь: " + file);
    }
    public NullFileEx(){
        super("Файла не существует. Открыть не получится");
    }
}
