package usta.sistemas;

import java.util.Scanner;

/**
 * This program calculates the market cost and the total of your products entered, the cost must be less than 500000
 *
 * @author Santiago Moreno
 * @version 22/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int sum = 0, product, totalProducts = 0;
        do {
            totalProducts++;
            System.out.println("Enter the cost value of the product (" + totalProducts + "): ");
            product = keyboard.nextInt();
            sum += product;
            System.out.println("The subtotal is: " + sum);
        } while (sum <= 500000);
        sum -= product;
        totalProducts -= 1;
        System.out.println("The total money to pay is: " + sum);
        System.out.println("The total products is: " + totalProducts);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------SoftMadeMarket-------------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 22/04/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno                ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

}