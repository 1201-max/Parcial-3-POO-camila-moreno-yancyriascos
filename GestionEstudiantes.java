/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainprincipal;

/**
 *
 * @author lizet
 */
public class GestionEstudiantes { 

  private Estudiante[] estudiantes;
    private int cantActual;
    private final int capMax;

    
    public GestionEstudiantes(int capMax) {
        this.capMax = capMax;
        this.estudiantes = new Estudiante[capMax];
        this.cantActual = 0;
    }

    GestionEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    public void agregarEstudiante(String nom, int edad, double prom) {
        if (cantActual < capMax) {
            estudiantes[cantActual] = new Estudiante(nom, edad, prom);
            cantActual++;
            System.out.println("Se agrego estudiante exitosamente.");
        } else {
            System.out.println("error. capacidad maxima ocupada.");
        }
    }

    
    public void mostrarEstudiantes() {
        if (cantActual == 0) {
            System.out.println("Aun no hay estudiantes registrados.");
        } else {
            for (int i = 0; i < cantActual; i++) {
                Estudiante e = estudiantes[i];
                System.out.println("Nombre: " + e.getNombre()+ ", Edad: " + e.getEdad() + ", Promedio: " + e.getPromedio());
            }
        }
    }


    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                Estudiante e = estudiantes[i];
                System.out.println("Estudiante encontrado: Nombre: " + e.getNombre() + ", Edad: " + e.getEdad() + ", Promedio: " + e.getPromedio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un estudiante con el nombre " + nombre);
        }
    }

   
    public void calcularPromedioGeneral() {
        if (cantActual == 0) {
            System.out.println("No hay estudiantes registrados para calcular el promedio.");
        } else {
            double sum = 0;
            for (int i = 0; i < cantActual; i++) {
                sum += estudiantes[i].getPromedio();
            }
            System.out.println("El promedio general de los estudiantes es: " + (sum / cantActual));
        }
    }
}