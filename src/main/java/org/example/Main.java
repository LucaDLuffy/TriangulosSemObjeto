package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measuares of triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measuares of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * ( p - xA) * ( p - xB) * ( p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * ( p - yA) * ( p - yB) * ( p - yC));

        System.out.printf("Triangle X Area: %.4f%n", areaX);
        System.out.printf("Triangle Y Area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("large Area: X");
        } else {
            System.out.println("large area Y");
        }



        sc.close();
    }
}