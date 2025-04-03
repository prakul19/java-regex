package com.bridgelabz.regex.extractionproblems;

import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        String input = "Visit https://www.google.com and http://example.org for more info.";

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
