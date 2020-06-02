package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Santiago Moreno
        Date: 14/04/2020
        Description: This software determinate if a number is multiply of other
     */
    public static void main(String[] args) {
        menu();
        inputNumbers();
    }

    public static void menu() {
        System.out.println("╔====================================================╗");
        System.out.println("║--------------------SoftMultiply--------------------║");
        System.out.println("║====================================================║");
        System.out.println("║  version: 1.0      Date: 13/04/2020                ║");
        System.out.println("║====================================================║");
        System.out.println("║           Created by: Santiago Moreno              ║");
        System.out.println("╚====================================================╝");
        System.out.println("Enter the two numbers: ");
    }

    public static void inputNumbers() {
        Scanner keyboard = new Scanner(System.in);
        var number1 = keyboard.nextInt();
        var number2 = keyboard.nextInt();
        int biggerNumber = 0;
        int smallerNumber = 0;

        if (number1 == number2) {
            System.out.println("The numbers are same");
        } else if (number1 < number2) {
            biggerNumber = number2;
            smallerNumber = number1;
        } else {
            biggerNumber = number1;
            smallerNumber = number2;
        }
        var sooth = multiply(biggerNumber, smallerNumber);
        if (sooth)
            System.out.println("The number " + biggerNumber + " is multiply of " + smallerNumber);
        else
            System.out.println("The number " + biggerNumber + " is not multiply of " + smallerNumber);
    }

    public static boolean multiply(int p_number1, int p_number2) {
        boolean multiply;
        multiply = p_number1 % p_number2 == 0;
        return multiply;
    }
}