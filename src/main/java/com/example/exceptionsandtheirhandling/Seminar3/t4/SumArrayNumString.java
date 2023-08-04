package com.example.exceptionsandtheirhandling.Seminar3.t4;

public class SumArrayNumString {
    public static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException(i);
            }
            for (int j = 0; j < arr[0].length; j++) {
                try{
                    sum += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
