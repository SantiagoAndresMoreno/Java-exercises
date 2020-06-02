package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Santiago Moreno
        Date: 14/04/2020
        Description: This software calculate the area of some geometric figures
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        menu();
        var option = keyboard.nextInt();
        if (option <= 3 && option >= 1)
            if (option == 1)
                System.out.println("The area of the circle is: " + areaCircle() + " cm");
            else if (option == 2)
                System.out.println("The area of the triangle is: " + areaTriangle() + " cm");
            else
                System.out.println("The area of the square is: " + areaSquare() + " cm");
        else
            System.err.println("Error: Range no valid! ");

    }

    public static void menu() {
        System.out.println("╔==================================================╗");
        System.out.println("║--------------------SoftArea----------------------║");
        System.out.println("║==================================================║");
        System.out.println("║  version: 1.0     Date: 14/04/2020               ║");
        System.out.println("║==================================================║");
        System.out.println("║             Created by:Santiago Moreno           ║");
        System.out.println("╚==================================================╝");
        System.out.println("Enter the geometric figure to calculate \n 1. Circle \n 2. Triangle \n 3. Square");
    }

    public static double areaCircle() {
        // Description: This function calculate the area of the circle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle (in cm): ");
        double radius = keyboard.nextDouble();
        return (Math.pow(radius, 2)) * 3.1416;
    }

    public static double areaTriangle() {
        // Description: This function calculate the area of the triangle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the height of the triangle (in cm): ");
        double height = keyboard.nextDouble();
        System.out.println("Enter the base of the triangle (in cm): ");
        double base = keyboard.nextDouble();
        return (base * height) / 2;
    }

    public static double areaSquare() {
        // Description: This function calculate the area of the square
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the side of the square (in cm): ");
        double side = keyboard.nextDouble();
        return side * side;
    }
}