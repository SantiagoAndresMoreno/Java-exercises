package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program makes use of the try-catch exception instructions with an example of input by the keyboard
 *
 * @author Santiago Moreno
 * @version 28/05/2020
 */
public class Main {

    public static void main(String[] args) {
        boolean sooth = true;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter the total people: ");
                int totalPeople = keyboard.nextInt();
                sooth = true;
            } catch (Exception e) {
                System.err.println("Error: The program only allows numbers: ");
                sooth = false;
            }
        } while (!sooth);
    }
}