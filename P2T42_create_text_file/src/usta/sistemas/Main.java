package usta.sistemas;

import java.io.PrintWriter;

/**
 * Description: This program create a text file
 *
 * @author Santiago Moreno
 * @version 28/05/2020
 */
public class Main {

    public static void main(String[] args) {
        try {
            PrintWriter adminFiles = new PrintWriter("C:/Users/JaiderPerez/Documents/test.txt");
            adminFiles.println("First line");
            adminFiles.println("Second line");
            adminFiles.close();
        } catch (Exception e) {
            System.err.println("The software is finished because: ");
            e.printStackTrace();
        }
    }
}