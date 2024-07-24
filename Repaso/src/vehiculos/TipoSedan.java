/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import repaso.Comprador;
import repaso.Vehiculo;

/**
 *
 * @author utpl
 */
public class TipoSedan extends Vehiculo {
    
    private double porcentajeDescuento;
    private double seguroMecanico;

    public TipoSedan(Comprador pro, String m, double p, double por) {
        super(pro, m, p);
        porcentajeDescuento = por;
        seguroMecanico = precioBase * 0.01; 
        calcularPrecioFinal();
    }

    @Override
    public void calcularPrecioFinal() {
        double descuento = precioBase * porcentajeDescuento;
        precioFinal = precioBase - descuento + seguroMecanico;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Porcentaje Descuento: " + (porcentajeDescuento * 100) + "%\n" +
               "Seguro Adicional Mecánico: $" + seguroMecanico + "\n";
    }
}
    

