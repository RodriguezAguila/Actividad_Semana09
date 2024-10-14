/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos;

/**
 *5.- Crear un programa en Java que permita almacenar cinco números en el arreglo   

     a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c. 
 
a[]=10 20 30 40 50 

b[]=60 70 80 90 100 

c[]=10 60 20 70 30 80……100 
 * 
 */
import java.util.Scanner;
public class Propuesto05 {
    public static void main(String[] args) {
        // Crear dos arreglos de tamaño 5
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10]; // Arreglo para almacenar los valores intercalados

        // Crear un objeto Scanner para leer los datos de entrada
        Scanner lectura = new Scanner(System.in);

        // Ingresar los valores del arreglo a
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = lectura.nextInt();
        }

        // Ingresar los valores del arreglo b
        System.out.println("Ingrese 5 números para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = lectura.nextInt();
        }

        // Intercalar los valores de a y b en el arreglo c
        for (int i = 0, j = 0; i < 5; i++) {
            c[j++] = a[i]; // Colocar valor de a en posición j
            c[j++] = b[i]; // Colocar valor de b en la siguiente posición j
        }

        // Mostrar los valores del arreglo c intercalados
        System.out.println("Los valores del arreglo c intercalados son:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }

        // Cerrar el Scanner
        lectura.close();
    }
    
}
