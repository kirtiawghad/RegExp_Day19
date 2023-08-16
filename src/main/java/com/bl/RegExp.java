package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    static Pattern p = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_.]*[a-zA-Z0-9]@[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]+$");
    public static void main(String[] args) {
        String str = "abc.xyz@bl.co.in";
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
