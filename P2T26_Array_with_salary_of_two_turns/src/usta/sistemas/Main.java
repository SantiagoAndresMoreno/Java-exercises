package usta.sistemas;

/**
 * Description: This program generates eight random wages saves it in an arrangement, calculates its sum and prints
 * the salary of each employee. There are two payrolls, one in the morning and one in the afternoon.
 *
 * @author Santiago Moreno
 * @version 04/05/2020
 */
public class Main {

    public static void main(String[] args) {
        menu();
        int[] salaryMorning = getSalary();
        int[] salaryAfternoon = getSalary();

        System.out.println(" ----------Salaries Morning------------");
        System.out.println(" The total salary of the morning is: " + printSalary_totalSalary(salaryMorning));
        System.out.println(" ");
        System.out.println(" -----------Salaries Afternoon---------");
        System.out.println(" The total salary of the afternoon is: " + printSalary_totalSalary(salaryAfternoon));
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("╠----------------Salaries of two turns----------------╣");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0     Date: 04/05/2020                  ║");
        System.out.println("║═════════════════════════════════════════════════════║");
        System.out.println("║            Created by: Santiago Moreno              ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets random salaries and kep its in a Array
     *
     * @return Array that represent the salaries of employees
     */
    public static int[] getSalary() {
        int[] salary = new int[8];
        for (int i = 0; i < 8; i++) {
            salary[i] = (int) Math.floor(Math.random() * (10000000 - 877803 + 1) + 877803);
        }
        return salary;
    }

    /**
     * This function prints the list of salaries and return its total sum
     *
     * @param p_salary Array that represent the salaries of the morning or the afternoon
     * @return Integer that represent the total sum of salaries
     */
    public static int printSalary_totalSalary(int[] p_salary) {
        int totalSalary = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println(" The salary of employee (" + (i + 1) + ") is: " + p_salary[i]);
            totalSalary += p_salary[i];
        }
        return totalSalary;
    }
}