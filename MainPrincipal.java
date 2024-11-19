/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainprincipal;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEstudiantes gestion = new GestionEstudiantes(5);

        int opcion;

        do {
            System.out.println("******* EduPilo S.A. ******");
            System.out.println("*** MENÚ GESTIÓN ESTUDIANTES ****");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar todos los Estudiantes");
            System.out.println("3. Buscar estudiante por Nombre");
            System.out.println("4. Calcular el promedio General");
            System.out.println("5. Salir");
            System.out.print("Seleccione una Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = scanner.nextDouble();
                    gestion.agregarEstudiante(nombre, edad, promedio);
                    break;

                case 2:
                    gestion.mostrarEstudiantes();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    gestion.buscarPorNombre(nombreBuscar);
                    break;

                case 4:
                    gestion.calcularPromedioGeneral();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
