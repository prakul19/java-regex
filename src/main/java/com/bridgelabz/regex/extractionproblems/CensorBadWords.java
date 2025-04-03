package com.bridgelabz.regex.extractionproblems;

import java.util.regex.*;

public class CensorBadWords {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};
        String input = "This is a damn bad example with some stupid words.";
        for (String badWord : badWords) {
            String regex = "\\b" + badWord + "\\b";
            input = input.replaceAll(regex, "****");
        }
        System.out.println(input);
    }
}
