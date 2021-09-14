package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print( "What is the order amount? " );
        double amount = sc.nextDouble();

        System.out.print( "What state do you live in? " );
        sc.nextLine();      //eats the /n causing next line not to read
        String state = sc.nextLine();

        System.out.print( "What county do you live in? " );
        String county = sc.nextLine();

        double tax = 0;     //arbitrary initialization value

        if (state.equalsIgnoreCase("wisconsin"))
        {
            tax = .05;

            if (county.equalsIgnoreCase("eau claire"))
                tax += .005;

            else if (county.equalsIgnoreCase("dunn"))
                tax += .004;
        }

        else if (state.equalsIgnoreCase("illinois"))
            tax = .08;

        //otherwise, tax stays at zero
        //calculate
        double taxAmount = amount * tax;
        double total = amount + taxAmount;

        //output
        System.out.printf("The tax is $%.2f\nThe total is $%.2f\n", taxAmount, total);

    }
}
