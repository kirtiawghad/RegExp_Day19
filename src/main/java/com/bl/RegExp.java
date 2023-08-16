package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    static Pattern p = Pattern.compile("^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%?=*&]).{8,})$");
    public static void main(String[] args) {
        String password = "aA@1wert";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
