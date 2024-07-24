/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionaria;

import repaso.Comprador;
import repaso.Vehiculo;
import vehiculos.TipoCamioneta;
import vehiculos.TipoSedan;
import vehiculos.TipoSuv;

/**
 *
 * @author utpl
 */
public class Ejecutor {
        public static void main(String[] args) {
        // Crear objetos de prueba
        Comprador comprador1 = new Comprador("Juan Pérez", "1234567890");
        Comprador comprador2 = new Comprador("María Gómez", "0987654321");
        
        Vehiculo sedan1 = new TipoSedan(comprador1, "Honda", 30000.0, 0.05);
        // Crear vehículos
       
        Vehiculo sedan2 = new TipoSedan(comprador2, "Toyota", 35000.0, 0.03); 
        Vehiculo suv1 = new TipoSuv(comprador1, "Ford", 40000.0, 0.1); 
        Vehiculo camioneta1 = new TipoCamioneta(comprador2, "Chevrolet", 45000.0, 0.07); 

        // Crear concesionaria
        Concesionaria concesionaria = new Concesionaria("Mi Concesionaria");
        concesionaria.agregarVehiculo(sedan1);
        concesionaria.agregarVehiculo(sedan2);
        concesionaria.agregarVehiculo(suv1);
        concesionaria.agregarVehiculo(camioneta1);

        // Imprimir los detalles de la concesionaria
        System.out.println(concesionaria.toString());
    }
}
