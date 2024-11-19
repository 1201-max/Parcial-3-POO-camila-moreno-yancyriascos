/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainprincipal;

/**
 *
 * @author lizet
 */
public class Estudiante {
    private String nom;
    private int edad;
    private double prom;


    public Estudiante(String nom, int edad, double prom) {
        this.nom = nom;
        this.edad = edad;
        this.prom = prom;
    }

   
    public String getNombre() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return prom;
    }
}