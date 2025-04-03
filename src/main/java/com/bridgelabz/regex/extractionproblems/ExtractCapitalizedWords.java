package com.bridgelabz.regex.extractionproblems;

import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        String input = "Java is an Object Oriented programming language.";

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
