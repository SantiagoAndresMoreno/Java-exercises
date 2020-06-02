package usta.sistemas;

import java.util.Scanner;

/**
 * Description:This program determinate how many names contains the vowels a and e.
 * The names are enter by keyboard
 *
 * @author Santiago Moreno
 * @version 06/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int totalPersons = getTotalPerson();
        String[] namePerson = getPersons(totalPersons);
        nameWithVowels_a_e(namePerson, totalPersons);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Names with Vowels--------------------╣");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 06/05/2020                      ║");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno                  ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the total number of person and validate it (the value cant not negative)
     *
     * @return Integer that represent the total persons and the limit of array
     */
    public static int getTotalPerson() {
        System.out.println("Enter the total of person that you want to enter: ");
        int totalPersons = keyboard.nextInt();
        while (totalPersons < 0) {
            System.err.println("Error: the total persons can not negative! ");
            System.out.println("Enter another value: ");
            totalPersons = keyboard.nextInt();
        }
        return totalPersons;
    }

    /**
     * This function gets the person's names and save it in array list
     *
     * @param p_totalPersons Integer that represent the total persons and the limit of array
     * @return Array of person's names
     */
    public static String[] getPersons(int p_totalPersons) {
        String[] arrayPersons = new String[p_totalPersons];
        for (int i = 0; i < p_totalPersons; i++) {
            System.out.println("Enter the name of the person " + (i + 1) + ": ");
            if (i == 0) {
                arrayPersons[i] = keyboard.nextLine();
            }
            arrayPersons[i] = keyboard.nextLine();
        }
        return arrayPersons;
    }

    /**
     * This function determinate how many name contains the vowel a and the vowel e
     *
     * @param p_array        Array of person's names
     * @param p_totalPersons Integer that represent the total persons and the limit of array
     */
    public static void nameWithVowels_a_e(String[] p_array, int p_totalPersons) {
        int counterName_a = 0, counterName_e = 0;
        for (int i = 0; i < p_totalPersons; i++) {
            if (p_array[i].contains("a")) {
                counterName_a++;
            }
            if (p_array[i].contains("e")) {
                counterName_e++;
            }
        }
        System.out.println("The quantity of names that contains the vowel a are: " + counterName_a);
        System.out.println("The quantity of names that contains the vowel e are: " + counterName_e);
    }
}