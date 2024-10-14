/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuestos;

/**
 *4.- Crear un programa en Java que permita almacenar en un arreglo de datos cinco nombres de personas ingresadas y
 * realizar una búsqueda mediante un nombre ingresado.
 * Visualizar un mensaje indicando si la persona existe o no existe y la posición del número en el arreglo de datos
 * @author ALIEN
 */
import java.util.Scanner;
public class Propuesto04 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner lectura = new Scanner(System.in);

        // Crear un arreglo para almacenar los nombres de 5 personas
        String[] nombres = new String[5];

        // Solicitar los nombres de las personas
        System.out.println("Ingrese los nombres de 5 personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }

        // Solicitar el nombre a buscar
        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscar = lectura.nextLine();

        // Variable para controlar si se encontró el nombre
        boolean encontrado = false;

        // Buscar el nombre en el arreglo
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                // Si se encuentra el nombre, mostrar el mensaje y la posición
                System.out.println("La persona '" + nombreBuscar + "' existe en el arreglo en la posición " + (i + 1));
                encontrado = true;
                break;
            }
        }

        // Si no se encontró el nombre, mostrar el mensaje correspondiente
        if (!encontrado) {
            System.out.println("La persona '" + nombreBuscar + "' no existe en el arreglo.");
        }

        // Cerrar el Scanner
        lectura.close();
    }
    
}
