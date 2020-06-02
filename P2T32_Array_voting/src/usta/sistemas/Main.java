package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program generates the random number of votes for a number of candidates
 *
 * @author Santiago Moreno
 * @version 07/05/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int limit = getCandidates();
        int[] votes = generateVotes(limit);
        int candidateWinner = showWinner(votes, limit);
        showSecond(votes, limit, candidateWinner);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Random Votes-------------------╣");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 07/05/2020               ║");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║           Created by: Santiago Moreno            ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * This function get the number of candidates
     *
     * @return Integer that represents the limit of the array that saves the votes
     */
    public static int getCandidates() {
        System.out.println("Enter the number of candidates: ");
        int candidatesNumber = keyboard.nextInt();
        while (candidatesNumber < 2) {
            System.err.println("Error: the value can not negative! ");
            System.out.println("Enter another value: ");
            candidatesNumber = keyboard.nextInt();
        }
        return candidatesNumber;
    }

    /**
     * This function generates the votes number and save it in a Array
     *
     * @param p_limit Integer that represents the limit of the array that saves the votes
     * @return Array that saves the number of votes
     */
    public static int[] generateVotes(int p_limit) {
        int[] votes = new int[p_limit];
        for (int i = 0; i < p_limit; i++) {
            votes[i] = (int) (Math.random() * (5000 - 2 + 1) + 2);
            System.out.println("Number of votes of candidate  [" + (i + 1) + "] = " + votes[i]);
        }
        return votes;
    }

    /**
     * This function determinate the candidate winner and his votes number
     *
     * @param p_votes Array that saves the number of votes
     * @param p_limit Integer that represents the limit of the array that saves the votes
     */
    public static int showWinner(int[] p_votes, int p_limit) {
        int candidateWinner = 0, votesWinner = 0;
        for (int i = 0; i < p_limit; i++) {
            if (i == 0) {
                votesWinner = p_votes[i];
                candidateWinner = i;
            } else if (p_votes[i] > votesWinner) {
                votesWinner = p_votes[i];
                candidateWinner = i;
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("The candidate winner is the candidate number " + (candidateWinner + 1));
        System.out.println("with a total of votes of: " + votesWinner);
        return candidateWinner;
    }

    /**
     * This function determinate the second candidate and his votes number
     *
     * @param p_votes       Array that saves the number of votes
     * @param p_limit       Integer that represents the limit of the array that saves the votes
     * @param p_Winner Integer that represent the number the winner votes
     */
    public static void showSecond(int[] p_votes, int p_limit, int p_Winner) {
        int secondCandidate = 0, secondVotes = 0;
        for (int i = 0; i < p_limit; i++) {
            if (i  == p_Winner) {
                System.out.println("This is the winner! ");
            } else if (i  == 0) {
                secondVotes = p_votes[i];
                secondCandidate = i;
            } else if (p_votes[i] > secondVotes) {
                secondVotes = p_votes[i];
                secondCandidate = i;
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("The second candidate is the candidate number " + (secondCandidate + 1));
        System.out.println("with a total of votes of: " + secondVotes);
    }
}