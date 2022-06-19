package io.github.dbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the principle amount in rupees: ₹");
        float principleAmount = scanner.nextFloat();
        System.out.println("Please enter the rate of interest: ");
        float rateOfInterest = scanner.nextFloat();
        System.out.println("Please enter the time period in years: ");
        float timePeriod = scanner.nextFloat();
        SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
        float simpleInterest = simpleInterestCalculator.calculateSimpleInterest(principleAmount, rateOfInterest, timePeriod);
        System.out.println("The calculated simple interest is ₹ " + simpleInterest);
        scanner.close();
    }
}