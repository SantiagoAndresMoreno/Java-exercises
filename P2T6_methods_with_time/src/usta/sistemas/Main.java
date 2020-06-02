package usta.sistemas;

import java.util.Scanner;

/**
 * This software realize some time unit conversions
 * @author  Santiago Moreno
 * @version 15/04/2020
 */
public class Main {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int option = option();
        if (option == 1)
            hours_to_seconds();
        else if (option == 2)
            minutes_to_seconds();
        else
            seconds_to_hours_minutes();
    }

    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftTime--------------------╣");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 15/04/2020             ║");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno            ║");
        System.out.println("╚════════════════════════════════════════════════╝");
    }

    /**
     * This function return the option to convert
     * @return Integer representing the option
     */
    public static int option() {
        System.out.println("Enter the option of the conversion: ");
        System.out.println(" 1. Hour to second \n 2. Minutes to seconds \n 3. Seconds to hours and minutes");
        int option;
        option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("Error: Option is out range! ");
            System.out.println("Enter another option of the conversion: ");
            System.out.println(" 1. Hour to second \n 2. Minutes to seconds \n 3. Seconds to hours and minutes");
            option = keyboard.nextInt();
        }
        return option;
    }

    /**
     * This function convert hours to seconds
     */
    public static void hours_to_seconds() {
        System.out.println("Enter the number of hours to convert: ");
        int hours = keyboard.nextInt();
        int seconds = hours * 3600;
        System.out.println(hours + " hours equals to " + seconds + " seconds");
    }

    /**
     * This function convert minutes to seconds
     */
    public static void minutes_to_seconds() {
        System.out.println("Enter the numbers of minutes to convert: ");
        int minutes = keyboard.nextInt();
        int seconds = minutes * 60;
        System.out.println(minutes + " minutes equals to " + seconds + " seconds");
    }

    /**
     * This function convert seconds to hours and minutes
     */
    public static void seconds_to_hours_minutes() {
        System.out.println("Enter the numbers of seconds to convert: ");
        int seconds = keyboard.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        System.out.println(seconds + " seconds equals to " + hours + " hours and " + minutes + " minutes");
    }
}