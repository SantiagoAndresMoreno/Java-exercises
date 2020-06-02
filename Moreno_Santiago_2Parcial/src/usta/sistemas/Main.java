
package usta.sistemas;
//Autor: Santiago Andres Moreno Sanchez

//Fecha:26/05/2020

//Descripcion: Este programa determina cual fue el empleado que mas gano dinero en todo el año, el valor total de los sueldos y el promedio


import java.util.Scanner;

public class Main {
    public static int Psalario = 0; //Esta variable determina el mayor de los salarios
    public static int[][] matrix; //Esta matrix rellena los salarios
    public static int Promedio = 0;//Esta variable comparte el promedio obtenido
    public static int TotalSalarios = 0; //Esta variable determina la suma de los salarios totales
    public static int PSalario2 = 0; //Esta variable determina el mayor salario obtenido
    public static int Most_highers; //Esta variable determina al empleado con mayor salario




    public static void main(String[] args) {
        f_menu();
        f_fill_matrix();
        f_show_salary();
        f_show_higher_and_Average();
    }

    public static void f_menu() {
        //Este metodo permite mostrar el menu y saber el numero de empleados escritos por el usuario
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("╠------------------SoftSmartpeople-------------------╣");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║  version: 1.0    Fecha: 26/05/2020                 ║");
        System.out.println("║════════════════════════════════════════════════════║");
        System.out.println("║           Creado por: Santiago Moreno              ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados: ");
        int N = keyboard.nextInt();
        matrix = new int[N][12];
    }
    public static void f_show_salary() {
        //Descripcion: Este metodo muestra los valores de la matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("  ");
            System.out.println("\n El salario del empleado  " + (i + 1) + " es");
            for (int j = 0; j < 12; j++) {
                System.out.print("$"+matrix[i][j]);
                System.out.print("| ");

            }
        }
    }
    public static void f_fill_matrix() {
        //Descripcion: Este metodo permite obtener los salarios
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 12; j++) { matrix[i][j] = (int) Math.floor((Math.random() * ((980657 * 5) - 980657)) + 1);//numeros randomicos entre 980657*5 y 980657
                TotalSalarios += matrix[i][j];
            }
        }
    }

    public static void f_show_higher_and_Average() {
        //Este metodo determina el promedio, mayor salario y el total de todos los salarios
        for (int i = 0; i < matrix.length; i++) {
            PSalario2 = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                PSalario2 += matrix[i][j];
                if (PSalario2 > Psalario) {//Este metodo determina el mayor salario
                    Most_highers = (i + 1);
                    Psalario = PSalario2;
                }

            }
        }
        Promedio = (TotalSalarios / matrix.length);
        System.out.println("\n ");
        System.out.println("El salario mas alto obtenido junto a su empleado fue de" + Most_highers + " con la suma de " + Psalario);
        System.out.println("Los salarios obtenidos fueron: " + TotalSalarios);
        System.out.println("El promedio de los salarios obtenidos fueron: " + Promedio);
    }

}
