package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generates the weights (values ​​between 20 to 120 kilos) for N men,
 * save the weights in a vector and determinate its classification
 *
 * @author Santiago Moreno
 * @version 06/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int peopleNumber = getLimit();
        double[] peopleWeights = getWeight(peopleNumber);
        classification_weights(peopleWeights, peopleNumber);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Weight Classification-------------------╣");
        System.out.println("║═══════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 07/05/2020                        ║");
        System.out.println("║═══════════════════════════════════════════════════════════║");
        System.out.println("║                Created by: Santiago Moreno                  ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the total of persons to calculate them weight
     *
     * @return Integer that represents the limit of the array that saves the weights
     */
    public static int getLimit() {
        System.out.println("Enter the total number of persons to calculate them weight: ");
        int totalWeight = keyboard.nextInt();
        while (totalWeight < 0) {
            System.err.println("The value can not negative! ");
            System.out.println("Enter again the value: ");
            totalWeight = keyboard.nextInt();
        }
        return totalWeight;
    }

    /**
     * This program generates and saves the weight of a certain number of people in an array
     *
     * @param p_limit Integer that represents the limit of the array that saves the weights
     * @return Array that saves the weights
     */
    public static double[] getWeight(int p_limit) {
        double[] weight = new double[p_limit];
        for (int i = 0; i < p_limit; i++) {
            weight[i] = Math.random() * (120 - 20 + 1) + 20;
            System.out.println("Weight person [" + (i + 1) + "] = " + weight[i]);
        }
        return weight;
    }

    /**
     * This function determinate how many person have underweight, normal weight and high weight
     *
     * @param p_weight Array that saves the weights
     * @param p_limit  Integer that represents the limit of the array that saves the weights
     */
    public static void classification_weights(double[] p_weight, int p_limit) {
        int counter_underweight = 0, counter_normalWeight = 0, counter_highWeight = 0;
        for (int i = 0; i < p_limit; i++) {
            if (p_weight[i] <= 40) {
                counter_underweight++;
            } else if (p_weight[i] < 70) {
                counter_normalWeight++;
            } else {
                counter_highWeight++;
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("The number of people who are malnourished (underweight) is: " + counter_underweight);
        System.out.println("The number of people who are skinny (normal weight) is: " + counter_normalWeight);
        System.out.println("The number of people who are fat (high weight) is: " + counter_highWeight);
    }
}