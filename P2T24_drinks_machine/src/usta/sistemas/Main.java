package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program simulates a hot drinks machine
 *
 * @author Santiago Moreno
 * @version 29/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        boolean sugar;
        int totalMoney = 0, value, product = getProduct(), remainingMoney;
        int costProduct = dataProducts(product, 1);
        while (totalMoney < costProduct) {
            value = moneyValue();
            totalMoney += value;
            if (totalMoney < costProduct) {
                System.out.println("You need " + (costProduct - totalMoney) + " pesos to complete your order");
            }
        }
        System.out.println("If you want add sugar to your drink enter true: ");
        sugar = keyboard.nextBoolean();
        if (sugar) {
            System.out.println("Sugar has been successfully added to your drink  ");
        }
        remainingMoney = totalMoney - costProduct;
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("   Your product takes " + dataProducts(product, 2) + " seconds...");
        System.out.println("   The total entered money is: " + totalMoney);
        System.out.println("   Your returned money is: " + remainingMoney);
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("╠-----------------------Drinks Machine-----------------------╣");
        System.out.println("║════════════════════════════════════════════════════════════║");
        System.out.println("║   Product               Value           Time (creation)    ║");
        System.out.println("║════════════════════════════════════════════════════════════║");
        System.out.println("║  1. Aromatic            $ 1.300            30 seconds      ║");
        System.out.println("║  2. Black Coffee        $ 1.000            30 seconds      ║");
        System.out.println("║  3. Milk Coffee         $ 1.900            45 seconds      ║");
        System.out.println("║  4. Capuchino           $ 2.500            60 seconds      ║");
        System.out.println("║  5. Mocachino           $ 2.700            70 seconds      ║");
        System.out.println("║════════════════════════════════════════════════════════════║");
        System.out.println("║                Created by: Santiago Moreno                 ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    /**
     * This function obtains the product that the user wants to buy and validates it
     *
     * @return Integer that represent the product number according with menu
     */
    public static int getProduct() {
        System.out.println("Enter the product that you want get: ");
        int product = keyboard.nextInt();
        while (product > 5 || product < 1) {
            System.err.println("Error: the number of this product does not exist! ");
            menu();
            System.out.println("Re-enter the product number! ");
            product = keyboard.nextInt();
        }
        return product;
    }

    /**
     * This function gets the money entered by the user, you only have to enter 100, 200, 500, 1000 or 2000
     *
     * @return Integer that represents the entered money value
     */
    public static int moneyValue() {
        boolean sooth = false;
        System.out.println("Enter the value of your ticket or currency ");
        System.out.println("The valid ticket or currency are: 100, 200, 500, 1000, 2000");
        int valueMoney = keyboard.nextInt();
        do {
            if (valueMoney == 100 || valueMoney == 200 || valueMoney == 500 || valueMoney == 1000 || valueMoney == 2000) {
                sooth = true;
            } else {
                System.err.println("Error: this value is not valid! ");
                System.out.println("Re-enter your value! ");
                valueMoney = keyboard.nextInt();
            }
        } while (!sooth);
        return valueMoney;
    }

    /**
     * This function gets the value of the product or the time process of the product
     *
     * @param p_product Integer that represent the product number according with menu
     * @param p_option  Integer that represent the option to calculate (cost product ot time process)
     * @return Integer that represent the value of the data ask
     */
    public static int dataProducts(int p_product, int p_option) {
        int costProduct, time, dataProduct;
        costProduct = switch (p_product) {
            case 1 -> 1300;
            case 2 -> 1000;
            case 3 -> 1900;
            case 4 -> 2500;
            case 5 -> 2700;
            default -> 0;
        };
        time = switch (p_product) {
            case 1, 2 -> 30;
            case 3 -> 45;
            case 4 -> 60;
            case 5 -> 70;
            default -> 0;
        };
        if (p_option == 1) {
            dataProduct = costProduct;
        } else {
            dataProduct = time;
        }
        return dataProduct;
    }
}
