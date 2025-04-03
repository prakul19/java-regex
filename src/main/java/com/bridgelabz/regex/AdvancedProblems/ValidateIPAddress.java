package com.bridgelabz.regex.AdvancedProblems;

import java.util.regex.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";

        Pattern pattern = Pattern.compile(regex);
        String[] testIPs = {"192.168.1.1", "255.255.255.255", "300.12.34.56", "172.16.254.1", "999.999.999.999", "3.200.200.200"};

        for (String ip : testIPs) {
            System.out.println(ip + " → " + (pattern.matcher(ip).matches() ? "Valid" : "Invalid"));
        }
    }
}
