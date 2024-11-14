package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double sum = 0;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
        }
        System.out.printf(sc.locale(), "%.6f", sum);
    }
}
