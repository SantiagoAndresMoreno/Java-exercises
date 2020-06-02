package usta.sistemas;

/**
 * Description:This program simulates a voting process for the Boyacá governance where there are eight candidates
 * from the main political parties in Colombia
 *
 * @author Santiago Moreno
 * @version 28/05/2020
 */
public class Main {
    public static int MUNICIPALITIES = 123;
    public static int POLITICAL_PARTIES = 8;
    public static int[][] matrixVotes = new int[MUNICIPALITIES][POLITICAL_PARTIES];

    public static void main(String[] args) {
        menu();
        System.out.println("This software performs the voting process for the Boyacá \n" +
                "governance in which candidates from the main political \n" +
                "parties in Colombia participate. \n");
        System.out.println("The main political parties in colombia are: \n" +
                " 1. Liberal. \n" +
                " 2. Conservador. \n" +
                " 3. Alianza Verde. \n" +
                " 4. Partido de la U. \n" +
                " 5. Cambio Radical. \n" +
                " 6. Centro Democrático. \n" +
                " 7. Mira. \n" +
                " 8. Polo. ");
        getMatrix();
        printMatrixVotes();
        System.out.println();
        int[] sumVotesOfEachParty = getSumVotes();
        printSumVotes(sumVotesOfEachParty);
        int winnerPoliticalParty = getWinnerPoliticalParty(sumVotesOfEachParty);
        System.out.println("The winning candidate is from the political party: " +
                getNameOfPoliticalParty(winnerPoliticalParty));
        int politicalPartyWithSecondHighestVote = getSecondHighestVote(sumVotesOfEachParty);
        System.out.println("The candidate with the second highest vote is from political party: " +
                getNameOfPoliticalParty(politicalPartyWithSecondHighestVote));
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Colombian Democracy-------------------╣");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║  Version: 2.0     Date: 28/05/2020                      ║");
        System.out.println("║═════════════════════════════════════════════════════════║");
        System.out.println("║             Created by: Santiago Moreno                 ║");
        System.out.println("╚═════════════════════════════════════════════════════════╝");
    }

    /**
     * This function generate random votes for the parties in each municipality of Boyacá
     */
    public static void getMatrix() {
        for (int i = 0; i < matrixVotes.length; i++) {
            for (int j = 0; j < matrixVotes[0].length; j++) {
                matrixVotes[i][j] = (int) Math.floor(Math.random() * (1000) + 1);
            }
        }
    }

    /**
     * This function prints the matrix containing the votes
     */
    public static void printMatrixVotes() {
        System.out.println(" ");
        for (int i = 0; i < MUNICIPALITIES; i++) {
            System.out.print("Votes of the municipality " + (i + 1) + " = {");
            for (int j = 0; j < POLITICAL_PARTIES; j++) {
                System.out.print(" " + matrixVotes[i][j] + " ");
            }
            System.out.print("}");
            System.out.println(" \n");
        }
    }

    /**
     * This function calculates the total votes gets by each political party
     *
     * @return Array contains the total votes by each political party
     */
    public static int[] getSumVotes() {
        int[] sumVotesOfEachParty = new int[POLITICAL_PARTIES];
        for (int i = 0; i < POLITICAL_PARTIES; i++) {
            int sum = 0;
            for (int j = 0; j < MUNICIPALITIES; j++) {
                sum += matrixVotes[j][i];
            }
            sumVotesOfEachParty[i] = sum;
        }
        return sumVotesOfEachParty;
    }

    /**
     * This function returns the name of the political party according to its position
     *
     * @param position Integer representing the position of the political party according to the established order
     * @return String representing the name of the political party
     */
    public static String getNameOfPoliticalParty(int position) {
        String politicalParty = "";
        switch (position) {
            case 0 -> politicalParty = "Liberal";
            case 1 -> politicalParty = "Conservador";
            case 2 -> politicalParty = "Alianza Verde";
            case 3 -> politicalParty = "Partido de la U";
            case 4 -> politicalParty = "Cambio Radical";
            case 5 -> politicalParty = "Centro Democrático";
            case 6 -> politicalParty = "Mira";
            case 7 -> politicalParty = "Polo";
            default -> System.out.println("Error: the option is incorrect ");
        }
        return politicalParty;
    }

    /**
     * This function prints the array containing the total votes for each political party
     *
     * @param sumVotes Array contains the total votes by each political party
     */
    public static void printSumVotes(int[] sumVotes) {
        for (int i = 0; i < POLITICAL_PARTIES; i++) {
            System.out.println("Votes by " + getNameOfPoliticalParty(i) + ": " +
                    "{" + sumVotes[i] + "} \n");
        }
    }

    /**
     * This function gets the political party number of the winning candidate
     *
     * @param sumVotes Array contains the total votes by each political party
     * @return Integer representing the number or position of the political party
     */
    public static int getWinnerPoliticalParty(int[] sumVotes) {
        int winningPoliticalParty = 0, higherVotesNumber = sumVotes[0];
        for (int i = 1; i < POLITICAL_PARTIES; i++) {
            if (higherVotesNumber < sumVotes[i]) {
                higherVotesNumber = sumVotes[i];
                winningPoliticalParty = i;
            }
        }
        return (winningPoliticalParty);
    }

    /**
     * This function calculates the number of the candidate's political party with the second highest vote
     *
     * @param sumVotes Array contains the total votes by each political party
     * @return Integer representing the number or position of the political party
     */
    public static int getSecondHighestVote(int[] sumVotes) {
        int secondHighestVote = 0, votesNumber = 0;
        int winnerPoliticalParty = (getWinnerPoliticalParty(sumVotes));
        for (int i = 0; i < POLITICAL_PARTIES; i++) {
            if (i != (winnerPoliticalParty)) {
                if (votesNumber < sumVotes[i]) {
                    votesNumber = sumVotes[i];
                    secondHighestVote = i;
                }
            }
        }
        return (secondHighestVote);
    }
}