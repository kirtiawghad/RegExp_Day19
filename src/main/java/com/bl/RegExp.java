package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    static Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]*(?=.*[A-Z]).*$");
    public static void main(String[] args) {
        String password = "kirtI";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }



    }
}
