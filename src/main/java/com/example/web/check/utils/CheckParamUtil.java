package com.example.web.check.utils;

import com.example.web.check.CheckType;

public class CheckParamUtil {

    private static boolean verifyAge(String verifyValue,String value){
        return Integer.parseInt(verifyValue) <= Integer.parseInt(value);
    }

    private static boolean verifyName(String verifyValue){
        return verifyValue.equals("admin");
    }

    private static boolean verifyPassword(String verifyValue){
        return verifyValue.equals("123");
    }

    public static boolean check(String verifyValue, CheckType type,String value){
        switch (type){
            case AGE:
                return verifyAge(verifyValue,value);
            case USERNAME:
                return verifyName(verifyValue);
            case PASSWORD:
                return verifyPassword(verifyValue);
            default:
                return false;
        }
    }
}
