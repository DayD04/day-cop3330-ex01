package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is your name?" );
        String theName = input.nextLine();
        System.out.println("Hello, " + theName + ", nice to meet you!");

    }
}
