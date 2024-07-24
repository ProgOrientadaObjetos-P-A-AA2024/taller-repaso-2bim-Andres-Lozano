/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author utpl
 */
public class Comprador {
    
    private String nombre, cedula;
       public Comprador(String n, String c) {
        nombre = n;
        cedula = c;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecesCedula(String x) {
        cedula = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return nombre + " (Cédula: " + cedula + ")";
    }
    
}
