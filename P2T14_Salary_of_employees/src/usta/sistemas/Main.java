package usta.sistemas;

import java.util.Scanner;

/**
 * Description: This program calculates the average salary, total salary and highest salary of N employees
 *
 * @author Santiago Moreno
 * @version 21/04/2020
 */
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int employees = employeesNumber();
        double averageSalary, sumSalary = 0, salary, higherSalary = 0;
        for (int i = 1; i <= employees; i++) {
            salary = getSalary(i);
            sumSalary = sumSalary + salary;
            System.out.println(sumSalary);
            if (i == 1)
                higherSalary = salary;
            else if (higherSalary < salary)
                higherSalary = salary;
        }
        averageSalary = sumSalary / employees;
        System.out.println("The higher salary is: " + higherSalary);
        System.out.println("The sum of salaries is: " + sumSalary);
        System.out.println("The average of salaries is: " + averageSalary);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("╠--------------------SoftSalary--------------------╣");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 21/04/2020               ║");
        System.out.println("║══════════════════════════════════════════════════║");
        System.out.println("║         Created by: Santiago Moreno              ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /**
     * This function get the employees number
     * @return Integer that represent the employees's number
     */
    public static int employeesNumber() {
        System.out.println("Enter the employees number: ");
        var employees = keyboard.nextInt();
        while (employees < 0) {
            System.err.println("Error: The quantity of employees must not be less than 0");
            System.out.println("Enter the value again!");
            employees = keyboard.nextInt();
        }
        return employees;
    }

    /**
     * This function gets the wage and the days worked entered in the keyboard and calculates the salary
     * @param p_index Integer that represent the position of the employee
     * @return double that represent the finally salary of a employees according at days worked
     */
    public static double getSalary(int p_index) {
        double wage, salary, days;
        do {
            System.out.println("Enter the wage of the employee " + p_index + " (the wage must not be negative)");
            wage = keyboard.nextInt();
        } while (wage < 0);
        do {
            System.out.println("Enter his days worked (the days must be between 1 and 30):");
            days = keyboard.nextInt();
        } while (days < 0 || days > 30);
        salary = (wage / 30) * days;
        return salary;
    }
}
