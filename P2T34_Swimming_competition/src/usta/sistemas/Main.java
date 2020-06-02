package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generates a multidimensional array where saves the times of ten participants of a
 * swimming competition
 *
 * @author Jaider Pérez
 * @version 12/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int participants = getParticipants();
        float[][] timesParticipants = getMatrix(participants);
        printMatrix(timesParticipants, participants);
        participantWinner(timesParticipants, participants);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Swimming Competition-------------------╣");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 12/05/2020                       ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║             Created by: Santiago Moreno                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    /**
     * This function get the number of participants
     *
     * @return Integer that represents the participants's number
     */
    public static int getParticipants() {
        int participantNumber;
        System.out.println("Enter the number of participants ");
        do {
            System.out.println("The value can not negative! ");
            participantNumber = keyboard.nextInt();
        } while (participantNumber < 0);
        return participantNumber;
    }

    /**
     * This function generates the matrix that saves the times for each participant
     *
     * @return Matrix that contains the times for each participant
     */
    public static float[][] getMatrix(int p_participantsNumber) {
        float[][] timesParticipants = new float[p_participantsNumber][10];
        for (int i = 0; i < p_participantsNumber; i++) {
            for (int j = 0; j < 10; j++) {
                timesParticipants[i][j] = (float) (Math.random() * (10 - 6) + 6);
            }
        }
        return timesParticipants;
    }

    /**
     * This function print the matrix that contains the times for each participant
     *
     * @param p_matrix             Matrix that to save the times for each participant
     * @param p_participantsNumber Integer that represent the participants's number
     */
    public static void printMatrix(float[][] p_matrix, int p_participantsNumber) {
        for (int i = 0; i < p_participantsNumber; i++) {
            System.out.println("The times of the participant " + (i + 1) + " are:");
            for (int j = 0; j < 10; j++) {
                System.out.println("  Time " + (j + 1) + " is: " + p_matrix[i][j]);

            }
            System.out.println(" ");
        }
    }

    /**
     * This function determinate the participant winner and his time record
     *
     * @param p_matrix             Matrix that to save the times for each participant
     * @param p_participantsNumber Integer that represent the participants's number
     */
    public static void participantWinner(float[][] p_matrix, int p_participantsNumber) {
        int winner = 0;
        float timeWinner = 0;
        for (int i = 0; i < p_participantsNumber; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    winner = i;
                    timeWinner = p_matrix[i][j];
                } else if (p_matrix[i][j] < timeWinner) {
                    winner = i;
                    timeWinner = p_matrix[i][j];
                }
            }
        }
        System.out.println("The winner of this competition is the participant number: " + (winner + 1));
        System.out.println("with a time record of: " + timeWinner);
    }
}