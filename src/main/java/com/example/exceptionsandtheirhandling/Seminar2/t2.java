package com.example.exceptionsandtheirhandling.Seminar2;

public class t2 {
    public static void main(String[] args) {
        String[][] i = {{"10", "7", "8"}, {"4", "5", "6"}};
        System.out.println(sum2d(i));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(isNumeric(arr[i][j]) && !arr[i][j].equals("0")){
                    System.out.println(Integer.parseInt(arr[i][j]));
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return sum;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
