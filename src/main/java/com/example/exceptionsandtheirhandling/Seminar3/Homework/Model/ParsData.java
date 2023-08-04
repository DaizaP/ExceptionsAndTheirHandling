package com.example.exceptionsandtheirhandling.Seminar3.Homework.Model;

public class ParsData implements Parser{
    @Override
    public String[] parserData(String[] data) throws RuntimeException{
        if (data.length > 6){
            throw new RuntimeException("Вы ввели больше данных чем нужно");
        }
        if (data.length < 6){
            throw new RuntimeException("Вы ввели меньше данных чем нужно");
        }
        int i = 0;
        String[] res = new String[6];
        for (String str: data){
            if(str.matches(RegExValidFIO)){
                res[i] = str;
                i++;
            }else if(str.matches(RegExValidBirthDate)){
                res[3] = str;
            }else if(str.matches(RegExValidRusPhoneNum)){
                res[4] = str;
            }else if(str.matches(RegExValidMaleFemale)){
                res[5] = str;
            }
        }
        for (int j =0; j< res.length; j++) {
            if (res[j] == null){
                throw new NullPointerException(
                        "Преобразование строки прошло неудачно. Индекс значения с ошибкой: " + j);
            }
        }
        return res;
    }
}
