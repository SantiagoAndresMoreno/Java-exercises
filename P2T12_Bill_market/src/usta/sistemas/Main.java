package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program simulate a bill of market
 *
 * @author Santiago Moreno
 * @version 21/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int total_products = totalProducts();
        System.out.println("The total bill plus Iva 19% is: " + getTotal(total_products));

    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftBill--------------------╣");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 21/04/2020             ║");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno            ║");
        System.out.println("╚════════════════════════════════════════════════╝");
    }

    /**
     * This function get the total products
     *
     * @return Integer that represent the quantity of products
     */
    public static int totalProducts() {
        int products;
        do {
            System.out.println("Enter the total of products to pay (the products don't must be negatives): ");
            products = keyboard.nextInt();
        } while (products < 0);

        return products;
    }

    /**
     * This function calculates the total value of the products entered
     *
     * @param p_totalProducts Integer that represent the total products to calculate
     * @return double that represent the total value of the products plus Iva 19% if a product is greater than 1000
     */
    public static double getTotal(int p_totalProducts) {
        double totalProducts = 0, product;
        for (int i = 1; i <= p_totalProducts; i++) {
            System.out.println("Enter the product " + i);
            product = keyboard.nextInt();
            if (product < 1000) {
                totalProducts = totalProducts + product;
            }
            totalProducts = totalProducts + (product + product * 0.19);
        }
        return totalProducts;
    }
}