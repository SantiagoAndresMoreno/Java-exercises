package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program Records the times of each lap of training and determines the best lap
 *
 * @author Santiago Moreno
 * @version 23/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int totalLaps = 0, bestLap = 0;
        double average, sum = 0;

        while (f_continue()) {
            totalLaps++;
            int lap = getTime(totalLaps);
            if (totalLaps == 1) {
                bestLap = lap;
            } else if (bestLap > lap) {
                bestLap = lap;
            }
            sum += lap;
        }
        average = sum / totalLaps;
        System.out.println("The sum of lap times is: " + sum);
        System.out.println("The average of laps times is: " + average);
        System.out.println("The best lap is: " + bestLap);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftSportTime--------------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 23/04/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno               ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function checks if the user wants continue or abandon the competition
     * @return Boolean that represent if continue or abandon the competition
     */
    public static boolean f_continue() {
        System.out.println("Do you want continue? Enter true or false: ");
        return keyboard.nextBoolean();
    }

    /**
     * This function get the lap time, check and returns the correct lap time
     * @param p_numberLap integer that represent the lap number
     * @return Integer tha represent the correct time lap entered
     */
    public static int getTime(int p_numberLap) {
        System.out.println("Enter the time of the lap (" + p_numberLap + ") in seconds: ");
        int lapTime = keyboard.nextInt();
        while (lapTime < 0) {
            System.err.println("Error: the time mustn't less than 0");
            System.out.println("Enter again the time of the lap (" + p_numberLap + ") in seconds: ");
            lapTime = keyboard.nextInt();
        }
        return lapTime;
    }
}