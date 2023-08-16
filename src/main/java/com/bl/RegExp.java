package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    static Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z]{8}$");
    public static void main(String[] args) {
        String password = "kirtiMada";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
