package com.bridgelabz.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {
    // regex pattern
    private static String regex = "^[#]{1}[0-9A-Fa-f]{6}$";

    public static boolean isHexColorValid(String hexcolor) {
        return Pattern.matches(regex, hexcolor);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexColor = scanner.nextLine();
        System.out.println(hexColor + " → " + (isHexColorValid(hexColor) ? "Valid" : "Invalid"));
    }
}
