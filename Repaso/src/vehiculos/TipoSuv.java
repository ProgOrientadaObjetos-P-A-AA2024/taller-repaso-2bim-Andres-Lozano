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
public class TipoSuv extends Vehiculo {

 private double porcentajeSeguroPersonas;

    public TipoSuv(Comprador pro, String m, double p, double porcentajeSeguroPersonas) {
        super(pro, m, p);
        this.porcentajeSeguroPersonas = porcentajeSeguroPersonas;
        calcularPrecioFinal();
    }

    @Override
    public void calcularPrecioFinal() {
        double seguroPersonas = precioBase * porcentajeSeguroPersonas;
        precioFinal = precioBase + seguroPersonas;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Porcentaje Seguro Personas: " + (porcentajeSeguroPersonas * 100) + "%\n";
    }
    
    
}
