package com.example.exceptionsandtheirhandling.Seminar3.t2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer count = 0;

    @Override
    public void close(){
        this.count = null;
    }

    public void add() throws Exception {
        checkClose();
        count++;
    }
    private void checkClose() throws Exception{
        if (count == null){
            throw new IOException("Экземпляр закрыт");
        }
    }

    public int getCount() throws Exception {
        checkClose();
        return count;
    }
}
