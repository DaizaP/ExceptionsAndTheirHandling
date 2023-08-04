package com.example.exceptionsandtheirhandling.Seminar3.t3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T3 {
    public static void main(String[] args) throws NullFileEx {
        try{
            int a = 5 / 0;
        }catch (ArithmeticException e) {
            try{
                throw new ZeroEx();
            }catch (ZeroEx ex){
                System.out.println(ex.getMessage());
        }

        }

        try{
            Integer[] array = {1,2,3,null,5,6,7};
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
                array[j]++;
            }
        }catch (NullPointerException e){
            try{
                throw new NullPosLinkedListEx();
            }catch (NullPosLinkedListEx ex){
                System.out.println(ex.getMessage());
            }
        }
        try (FileReader fr = new FileReader("12w3e4rtyui.txt")){
            int a = 5;
        } catch (FileNotFoundException e) {
            try{
                throw new NullFileEx();
            }catch (NullFileEx ex){
                System.out.println(ex.getMessage());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
