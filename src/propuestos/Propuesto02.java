/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos;

/**
 *2- Crear un programa en Java que permita registrar el ingreso económico de las n personas en un arreglo de datos. 
 *Visualizar ingreso promedio, ingreso mayor de las personas.
 * 
 */
import java.util.Scanner;
public class Propuesto02 {
    public static void main(String[] args) {
        double sumaIngresos = 0;
        double ingresoMayor = 0;
        int n;
    
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
         n = lectura.nextInt();

        // Crear un arreglo para almacenar los ingresos
        double[] ingresos = new double[n];

        // Variables para almacenar la suma de los ingresos y el ingreso mayor
        

        // Ingresar los ingresos de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
            sumaIngresos += ingresos[i];

            // Verificar si el ingreso actual es el mayor
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }

        // Calcular el promedio
        double promedioIngreso = sumaIngresos / n;

        // Mostrar el promedio de los ingresos y el mayor ingreso
        System.out.println("El ingreso promedio de las personas es: " + promedioIngreso);
        System.out.println("El ingreso mayor es: " + ingresoMayor);

        // Cerrar el Scanner
        lectura.close();
    }
    
}
