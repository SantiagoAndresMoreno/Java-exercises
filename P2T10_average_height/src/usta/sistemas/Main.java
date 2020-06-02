package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program calculate the average height of n children
 *
 * @author Santiago Moreno
 * @version 20/04/2020
 */
public class Main {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int total_children = totalChildren();
        double averageHeight = 0;
        for (int i = 1; i < total_children; i++) {
            averageHeight = averageHeight + checkHeight(i);
        }
        averageHeight = averageHeight / total_children;
        System.out.println("The average children's height is: " + averageHeight + " meters");
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------SoftAverageChildren-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 16/04/2020                      ║");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║             Created by: Santiago Moreno                 ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    /**
     * This function return the total of children
     *
     * @return integer that represent the children's number
     */
    public static int totalChildren() {
        System.out.println("Enter the total children to calculate their average: ");
        int children = keyboard.nextInt();
        while (children <= 0) {
            System.err.println("Error: the children's number should be greater than 0. Enter again this value");
            System.out.println("Enter the number again: ");
            children = keyboard.nextInt();
        }
        return children;
    }

    /**
     * This function valid the height of the children entered
     *
     * @param p_children Integer that represent the number of the children
     * @return Double that represent the correct height entered
     */
    public static double checkHeight(int p_children) {
        System.out.println("Enter the height in meters of the children " + p_children);
        double height = keyboard.nextDouble();
        while (height <= 0.20 || height >= 2) {
            System.err.println("Error: The children's height should between 0.2 meters and 2 meters");
            System.out.println("Enter the height again: ");
            height = keyboard.nextDouble();
        }
        return height;
    }
}