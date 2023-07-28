package com.example.exceptionsandtheirhandling.Homework.t2;
import java.util.Arrays;
import java.util.stream.IntStream;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        if(a.length != b.length) {
            return new int[]{0};
        }
        int[] c = IntStream.range(0, a.length).map(i -> a[i] - b[i]).toArray();
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}