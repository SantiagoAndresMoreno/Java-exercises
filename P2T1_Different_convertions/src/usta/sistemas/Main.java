package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Santiago Moreno
       Date: 13/04/2020
       Description: This program convert temp units
     */
    public static void main(String[] args) {
        menu();
        int degrees = kindDegrees();
        int degrees_to_convert = kindConvert(degrees);
        if (degrees_to_convert != 0 && degrees != 0) {
            System.out.println("The result of this conversion is: " + get_grades(degrees, degrees_to_convert));
        } else {
            System.err.println("Error: kinds no valid!");
        }
    }

    public static void menu() {
        // Description:This function shows the menu of the software
        System.out.println("╔===================================================╗");
        System.out.println("║--------------------SoftConvert--------------------║");
        System.out.println("║===================================================║");
        System.out.println("║  version: 1.0     Date: 13/04/2020                ║");
        System.out.println("║===================================================║");
        System.out.println("║            Created by: Santiago Moreno            ║");
        System.out.println("╚===================================================╝");
        System.out.println("Enter the kind of degrees: \n 1. Celsius \n 2. fahrenheit \n 3. Kelvin");
    }

    public static int kindDegrees() {
        // Description: This function return the kind of degrees
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        if (option == 1 || option == 2 || option == 3) {
            System.out.println("Oh great! ");
        } else {
            option = 0;
        }
        return option;
    }

    public static int kindConvert(int kindDegrees) {
        // Description: This function return the degrees to convert
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the kind of degrees to convert: \n 1. Celsius \n 2. fahrenheit \n 3. Kelvin");
        int opt = keyboard.nextInt();
        if (opt == 1 || opt == 2 || opt == 3) {
            if (opt == kindDegrees) {
                System.err.println("Error: The kind's degrees are same! ");
                opt = 0;
            }
        } else {
            opt = 0;
        }
        return opt;
    }

    public static double get_grades(int degrees, int degrees_to_convert) {
        // Description: This function enter the degrees value and call an function for each process
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the degrees's value: ");
        double degreesValue = keyboard.nextDouble();

        double result = 0;

        if (degrees == 1 && degrees_to_convert == 2) {
            result = celsius_to_fahrenheit(degreesValue);
        }
        if (degrees == 1 && degrees_to_convert == 3) {
            result = celsius_to_kelvin(degreesValue);
        }
        if (degrees == 2 && degrees_to_convert == 1) {
            result = fahrenheit_to_celsius(degreesValue);
        }
        if (degrees == 2 && degrees_to_convert == 3) {
            result = fahrenheit_to_kelvin(degreesValue);
        }
        if (degrees == 3 && degrees_to_convert == 1) {
            result = kelvin_to_celsius(degreesValue);
        }
        if (degrees == 3 && degrees_to_convert == 2) {
            result = kelvin_to_fahrenheit(degreesValue);
        }
        return result;
    }

    public static double celsius_to_fahrenheit(double p_degrees) {
        double result;
        result = 1.8 * p_degrees + 32;
        return result;
    }

    public static double celsius_to_kelvin(double p_degrees) {
        double result;
        result = p_degrees + 273.15;
        return result;
    }

    public static double fahrenheit_to_celsius(double p_degrees) {
        double result;
        result = (5.0 / 9.0) * (p_degrees - 32);
        return result;
    }

    public static double fahrenheit_to_kelvin(double p_degrees) {
        double result;
        result = (5.0 / 9.0) * (p_degrees - 32) + 273.15;
        return result;
    }

    public static double kelvin_to_celsius(double p_degrees) {
        double result;
        result = p_degrees - 273.15;
        return result;
    }

    public static double kelvin_to_fahrenheit(double p_degrees) {
        double result;
        result = 1.8 * (p_degrees - 273.15) + 32;
        return result;
    }
}