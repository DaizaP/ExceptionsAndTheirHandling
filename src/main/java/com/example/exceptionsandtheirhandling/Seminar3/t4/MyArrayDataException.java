package com.example.exceptionsandtheirhandling.Seminar3.t4;

public class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int index, int index0) {
        super(String.format("Ошибка преобразования в число. Индекс позиции: %s x %s. Операция остановлена.", index, index0));
    }
}
