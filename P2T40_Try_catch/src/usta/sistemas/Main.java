package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program makes use of the try-catch exception instructions with an example of input by the keyboard
 *
 * @author Santiago Moreno
 * @version 28/05/2020
 */
public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter the first number: ");
            int number1 = keyboard.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = keyboard.nextInt();
            System.out.println("Enter the third number: ");
            int number3 = keyboard.nextInt();

            int sum = number1 + number2 + number3;
            System.out.println("The sum is: " + sum);

        } catch (Exception e) {
            System.err.println("Error: The software allows only numbers not words ( public static void main): "
                    + e.toString());
            e.printStackTrace();
        }

    }
}