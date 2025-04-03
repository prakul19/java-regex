package com.bridgelabz.regex.advancedproblems;

import java.util.regex.*;

public class ExtractingProgrammingLanguage {
    public static void main(String[] args) {
        String regex = "\\b(Java|Python|JavaScript|C|Go|C++|Rust|Swift|Kotlin|PHP)\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
