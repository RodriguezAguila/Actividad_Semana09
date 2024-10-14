/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos;

/**
 *Crear un programa en Java que permita registrar el peso de las n personas en un arreglo de datos.
 * Visualizar el peso promedio de las personas
 * 
 */
import java.util.Scanner;
public class Propuesto01 {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        int n;
        double sumaPesos = 0;
        double promedioPeso;
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
         n = lectura.nextInt();

        // Crear un arreglo para almacenar los pesos
        double[] pesos = new double[n];
            
        // Ingresar los pesos de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
            sumaPesos += pesos[i];
        }

        // Calcular el promedio
        promedioPeso = sumaPesos / n;

        // Mostrar el promedio de los pesos
        System.out.println("El peso promedio de las personas es: " + promedioPeso);

        // Cerrar el Scanner
        lectura.close();
    }
    
}
