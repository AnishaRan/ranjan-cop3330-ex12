package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principle = scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        double wholePer = scan.nextDouble();
        double per = wholePer / 100.0;
        System.out.print("Enter the number of years: ");
        int year = scan.nextInt();

        double simpleInt = principle * (1 + (per * year));

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.", year, wholePer, simpleInt);


    }
}
