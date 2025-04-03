package com.bridgelabz.regex.advancedproblems;

import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        String input = "The price is $45.99, and the discount is 10.50.";
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
