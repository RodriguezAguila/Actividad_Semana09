/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos;

/**
 *3.- Crear un programa en Java que permita registrar las compras de los n personas en un arreglo de datos.
 * Visualizar el total, promedio y compra mayor y menor.
 * @author ALIEN
 */
import java.util.Scanner;
public class Propuesto03 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        int n = lectura.nextInt();

        // Crear un arreglo para almacenar las compras
        double[] compras = new double[n];

        // Variables para almacenar el total, mayor y menor compra
        double totalCompras = 0;
        double compraMayor = Double.MIN_VALUE;  // Inicializado al valor mínimo posible
        double compraMenor = Double.MAX_VALUE;  // Inicializado al valor máximo posible

        // Ingresar las compras de las personas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
            totalCompras += compras[i];

            // Verificar si la compra actual es mayor o menor que las anteriores
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }

        // Calcular el promedio
        double promedioCompras = totalCompras / n;

        // Mostrar el total, promedio, compra mayor y compra menor
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);

        // Cerrar el Scanner
        lectura.close();
    }
    
}
