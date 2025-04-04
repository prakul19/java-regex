package com.bridgelabz.regex.advancedproblems;

import java.util.regex.*;
import java.util.HashSet;

public class RepeatingWords {
    public static void main(String[] args) {
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        String input = "This is is a repeated repeated word test.";
        Matcher matcher = pattern.matcher(input);
        HashSet<String> uniqueRepeatingWords = new HashSet<>();
        while (matcher.find()) {
            if(uniqueRepeatingWords.contains(matcher.group())) {
                System.out.print(matcher.group()+" ");
            } else {
                uniqueRepeatingWords.add(matcher.group());
            }
        }
    }
}

