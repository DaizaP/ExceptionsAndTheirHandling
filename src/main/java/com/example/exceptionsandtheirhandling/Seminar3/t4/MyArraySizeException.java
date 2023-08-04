package com.example.exceptionsandtheirhandling.Seminar3.t4;

public class MyArraySizeException extends RuntimeException{
    MyArraySizeException(int i){
        super("Nine! Допустимый размер массива 4х4. Ошибка в строке в индексом "+ i);
    }
    MyArraySizeException(){
        super("Nine! Допустимый размер массива 4х4. Кол-во строк меньше допустимого значения");
    }
}
