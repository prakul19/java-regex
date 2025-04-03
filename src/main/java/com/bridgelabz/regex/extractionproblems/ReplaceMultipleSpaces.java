package com.bridgelabz.regex.extractionproblems;

import java.util.regex.*;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        String input = "This   is   an   example    with   multiple   spaces.";
        String result = input.replaceAll(regex, " ");
        System.out.println(result);
    }
}
