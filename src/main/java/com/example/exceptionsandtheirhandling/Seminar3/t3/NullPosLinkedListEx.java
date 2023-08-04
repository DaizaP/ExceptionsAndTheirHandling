package com.example.exceptionsandtheirhandling.Seminar3.t3;

public class NullPosLinkedListEx extends NullPointerException{
    public NullPosLinkedListEx(int index){
        super("обращение к пустому элементу в массиве запрещено. Введенный индекс: "+ index);
    }
    public NullPosLinkedListEx(){
        super("Нельзя обратиться к пустому элементу в массиве");
    }
}
