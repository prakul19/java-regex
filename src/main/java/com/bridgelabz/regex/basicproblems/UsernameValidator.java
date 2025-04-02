package com.bridgelabz.regex.basicproblems;

import java.util.regex.*;
import java.util.Scanner;

public class UsernameValidator {
    // regex pattern
    private static String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    public static boolean isValidUsername(String username) {
        return Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testUsernames = scanner.nextLine();
        System.out.println(testUsernames + " → " + (isValidUsername(testUsernames) ? "Valid" : "Invalid"));
    }
}


