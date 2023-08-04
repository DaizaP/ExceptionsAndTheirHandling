package com.example.exceptionsandtheirhandling.Seminar3.Homework.Model;


public interface Parser {
    String RegExValidRusPhoneNum = "^\\+?[0-9\\-\\s]*$";
    String RegExValidBirthDate = "(\\d{2})\\.(\\d{2})\\.(\\d{4})";
    String RegExValidMaleFemale = "[^а-яА-ЯёЁa-eg-ln-zA-EG-LN-Z]";
    String RegExValidFIO = "^[А-Яа-яЁёa-zA-Z]{2,64}$";
    String[] parserData(String[] str);


}
