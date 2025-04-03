package com.bridgelabz.regex.extractionproblems;

import java.util.regex.*;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        String input = "Contact us at support@example.com and info@company.org";

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

