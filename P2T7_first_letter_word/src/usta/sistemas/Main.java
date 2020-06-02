package usta.sistemas;

import java.util.Scanner;

/**
 * This program get the first letter in a word, replace vocals and valid the length of the word
 *
 * @author Santiago Moreno
 * @version 16/04/2020
 */
public class Main {
    static  Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int option = option();
        if (option == 1)
            firstLetter();
        else if (option == 2)
            wordUpperCase();
        else
            replaceVowels();
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftString--------------------╣");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 16/04/2020               ║");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno            ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * This function returns the chosen option to convert
     * @return Integer thar represent the chosen option
     */
    public static int option() {
        System.out.println("Enter the option to realize: \n 1. First letter \n 2. Word to uppercase \n 3. Replace vowels");
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("Error: option is out range!. Enter option in the established range ");
            option = keyboard.nextInt();
        }
        return option;
    }

    /**
     * This function check the entered word: This word should not five letters
     * @return modified string with more than five letters
     */
    public static String checkWord() {
        System.out.println("Enter a word: ");
        keyboard.nextLine();
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("Error: This word should have at least five letters. Enter another word: ");
            word = keyboard.nextLine();
        }
        return word;
    }

    /**
     * This function gets the first letter of the entered word
     */
    public static void firstLetter() {
        String word = checkWord();
        char[] chars = word.toCharArray();
        System.out.println("The first letter of " + word + " is " + chars[0]);
    }

    /**
     * This function convert the entered word to upper case
     */
    public static void wordUpperCase() {
        String word = checkWord();
        System.out.println("The word to Upper Case of " + word + " is: " + word.toUpperCase());
    }

    /**
     * This function replaces the vowels of entered word with @
     */
    public static void replaceVowels() {
        String word = checkWord();
        String newWord = word.toLowerCase();
        newWord = newWord.replace("a", "@").replace("e", "@").
                replace("i", "@").replace("o", "@").replace("u", "@");
        System.out.println("The changed word is: " + newWord);
    }
}