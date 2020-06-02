package usta.sistemas;

import java.util.Scanner;

/**
 * Description:This program generates the age of n people and save it in a array
 *
 * @author Santiago Moreno
 * @version 05/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int limit = getLimit();
        typeAgePeople(getAge(limit), limit);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Age People--------------------╣");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 05/05/2020               ║");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno              ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * This function asks the total number of person and validates it (the value can not negative)
     *
     * @return Integer that represent the entered total number of persons
     */
    public static int getLimit() {
        System.out.println("Enter the number of people: ");
        int limit = keyboard.nextInt();
        while (limit < 0) {
            System.err.println("The people's number can not be negative! ");
            System.out.println("Enter another value: ");
            limit = keyboard.nextInt();
        }
        return limit;
    }

    /**
     * This function gets the random ages of determinate number of people and save in a array list
     *
     * @param p_limit Integer that represent the entered total number of persons
     * @return Array of people's age
     */
    public static int[] getAge(int p_limit) {
        int[] agePeople = new int[p_limit];
        for (int i = 0; i < p_limit; i++) {
            agePeople[i] = (int) (Math.random() * 115) + 1;
            System.out.println("The age of person " + (i + 1) + " is: " + agePeople[i]);
        }
        return agePeople;
    }

    /**
     * This function calculates how many people are under 18 years old, over 18 years old, over 60 years old and the
     * total average age
     *
     * @param p_array Array that represent the list of people's ages
     * @param p_limit Integer that represent the limit of array
     */
    public static void typeAgePeople(int[] p_array, int p_limit) {
        double average, sumAge = 0;
        int peopleLess_18 = 0, peopleOver_18 = 0, peopleOver_60 = 0;
        for (int i = 0; i < p_limit; i++) {
            if (p_array[i] < 18) {
                peopleLess_18++;
                sumAge += p_array[i];
            } else if (p_array[i] < 60) {
                peopleOver_18++;
                sumAge += p_array[i];
            } else {
                peopleOver_60++;
                sumAge += p_array[i];
            }
        }
        average = sumAge / p_limit;
        System.out.println("--------------------------------------------------");
        System.out.println(peopleLess_18 + " persons are under 18 years old ");
        System.out.println(peopleOver_18 + " persons are over 18 years old ");
        System.out.println(peopleOver_60 + " persons are over 60 years old ");
        System.out.println("The average of people's age is: " + average);
        System.out.println("---------------------------------------------------");
    }
}