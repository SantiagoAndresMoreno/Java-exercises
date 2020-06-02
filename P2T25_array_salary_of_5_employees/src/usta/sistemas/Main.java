package usta.sistemas;

/**
 * Description:This program saves the salaries of 5 employees using an array (vector), where the salaries are
 * a random value between $ 1,000,000 and $ 2,000,000.
 *
 * @author Santiago Moreno
 * @version 04/05/2020
 */
public class Main {

    public static void main(String[] args) {
        menu();
        int[] salary = getSalary();
        printSalary(salary);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("╠--------------------Salary Employees--------------------╣");
        System.out.println("║════════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 04/05/2020                     ║");
        System.out.println("║════════════════════════════════════════════════════════║");
        System.out.println("║             Created by: Santiago Moreno                ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the random salaries of five employees and return it
     *
     * @return Array that represent the salaries of the employees
     */
    public static int[] getSalary() {
        int[] salary = new int[5];
        for (int i = 0; i < 5; i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 1000000 + 1) + 1000000);
        }
        return salary;
    }

    /**
     * This function prints the salaries of the employees
     *
     * @param p_salary Array that represents the salaries of five employees
     */
    public static void printSalary(int[] p_salary) {
        for (int i = 0; i < 5; i++) {
            System.out.println(" The salary of employee " + (i + 1) + " is: $ " + p_salary[i]);
        }
    }
}