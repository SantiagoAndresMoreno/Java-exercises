package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Santiago Andres Moreno
       Date:13/04/2020
       Description: This software calculate the average of the height of five students
     */
    public static void main(String[] args) {
        menu();
        var sum = sumHeight();
        System.out.println("The height's average of this students is: " + averageHeight(sum) + " cm");
    }

    public static void menu() {
        // Description:This function shows the menu of the software
        System.out.println("╔===================================================╗");
        System.out.println("║-----------------SoftAverageHeight-----------------║");
        System.out.println("║===================================================║");
        System.out.println("║  version: 1.0     Date: 13/04/2020                ║");
        System.out.println("║===================================================║");
        System.out.println("║            Created by: Santiago Moreno            ║");
        System.out.println("╚===================================================╝");
    }

    public static int sumHeight() {
        // Description:This function get the height of five students
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the height of the student " + i + " (in cm): ");
            int height = keyboard.nextInt();
            sum = sum + height;
        }
        return sum;
    }

    public static double averageHeight(double p_sum) {
        // Description:This function calculate the average of the heights entered
        return p_sum / 5;
    }
}