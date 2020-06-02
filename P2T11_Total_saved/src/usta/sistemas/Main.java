package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program calculate the total saved money for a person in n months
 *
 * @author Santiago Moreno   
 * @version 21/03/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int months = totalMonth();
        int totalSaved = 0, averageSaved, savedMoney;
        for (int i = 1; i <= months; i++) {
            do {
                System.out.println("Enter the saved money in the month " + i + " (The months don't must negative )");
                savedMoney = keyboard.nextInt();
            }
            while (savedMoney < 0);
            totalSaved = totalSaved + savedMoney;
        }
        averageSaved = totalSaved / months;
        System.out.println("The total saved money is: " + totalSaved + " and its average is: " + averageSaved);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------SoftSavedMoney-------------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 21/04/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║          Created by: Santiago Moreno               ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    /**
     * Description: This function gets and returns the quantity month
     *
     * @return integer that represent the quantity months entered
     */
    public static int totalMonth() {
        int months;
        do {
            System.out.println("Enter the total months, The months cannot be negatives: ");
            months = keyboard.nextInt();
        }
        while (months < 0);
        return months;
    }
}