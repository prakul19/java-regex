package com.bridgelabz.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.*;

public class LicensePlateNumber {
    // regex pattern
    private static String regex = "^[A-Z]{2}[0-9]{4}$";

    public static boolean isValidLicensePlate(String licenseplate) {
        return Pattern.matches(regex, licenseplate);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testLicensePlates = scanner.nextLine();
        System.out.println(testLicensePlates + " → " + (isValidLicensePlate(testLicensePlates) ? "Valid" : "Invalid"));
    }
}
