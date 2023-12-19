package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // constraints
        if(payment < 0 || payment > 1000000000){
            return;
        }

        // Write your code here.
        Locale locale = new Locale("en","IN");

        //DecimalFormat decimalFormat = new DecimalFormat("#.##");

        //payment = Double.parseDouble(decimalFormat.format(payment));

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        // nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String us = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        // nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String china = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String france = nf.format(payment);

        locale = new Locale("en","IN");
        nf = NumberFormat.getCurrencyInstance(locale);
        // nf.setRoundingMode(RoundingMode.HALF_DOWN);
        String india = nf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
