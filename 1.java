package com.ipd22;

import java.util.Random;
import java.util.Scanner;
/*
DAY 01 TASKS
        ============

        Setup
        -----

        Create repository on github/gitlab, call it, for example "DataStructures" (no spaces)
        Clone it on your computer so you can put all projects into it.
        Make sure to commit/push at least once a day after the class.

        Day01Arrays
        -----------

        Ask user for the size of the array to create, it must be 1 or greater.
        Show an error and end program if it's invalid.
        Also do not allow the program to crash if the entered value is not numerical.
        In such case also show an error and end the program.

        Allocate array of int values of the size user requested.

        Generate random numbers 1-100 and assign them to each item of that array.

        Display all numbers from the array comma-separated on a single line.

        Find and display all numbers in that array are prime numbers, comma-separated on a single line.

*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter Array Size, 1 or greater");
        Scanner scan = new Scanner(System.in);
        int sizeIntArray;
        try {
            String input = scan.nextLine();
            sizeIntArray = Integer.parseInt(input);
            int[] intArray = new int[sizeIntArray];
            if(sizeIntArray >=1 && sizeIntArray<=100){
            for (int i = 0; i < sizeIntArray; i++) {
                intArray[i] = (int) (Math.random() * 100);
                System.out.print(intArray[i]+(i==(sizeIntArray-1)?"":","));
            }}
            else{
                System.out.println("Size Of Array should be between 1-100");
            }
        } catch (Exception exc) {
            System.out.println("Error\n" + exc.getMessage());
        }
            }
    private boolean isPrime(int number1){
        return false;
    }
}
