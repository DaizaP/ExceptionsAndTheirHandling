package com.example.exceptionsandtheirhandling.Seminar3.t4;

import java.util.Arrays;

public class T4 {
    public static void main(String[] args) {
        String[][] string = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try{
            System.out.println(SumArrayNumString.sum(string));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(Arrays.toString(e.getStackTrace()) + e.getMessage());
        }
    }
}
