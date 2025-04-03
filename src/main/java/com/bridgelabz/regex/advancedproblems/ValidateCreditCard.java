package com.bridgelabz.regex.advancedproblems;

import java.util.regex.*;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String regex = "^(4|5)\\d{15}$";
        Pattern pattern = Pattern.compile(regex);
        String[] testCards = {"4123456789012345", "5123456789012345", "6123456789012345", "4223", "5234567890123456"};
        for (String card : testCards) {
            System.out.println(card + " → " + (pattern.matcher(card).matches() ? "Valid" : "Invalid"));
        }
    }
}
