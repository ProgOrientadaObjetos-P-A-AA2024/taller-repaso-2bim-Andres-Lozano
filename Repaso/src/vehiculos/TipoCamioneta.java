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
public class TipoCamioneta extends Vehiculo{
   
    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(Comprador pro, String m, double p, double por) {
        super(pro, m, p);
        porcentajeAdicionalImportacion = por;
        valorAdicionalImportacion = precioBase * porcentajeAdicionalImportacion;
        seguroMantenimiento = valorAdicionalImportacion * 1.5; 
        calcularPrecioFinal();
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + valorAdicionalImportacion + seguroMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Porcentaje Adicional Importación: " + (porcentajeAdicionalImportacion * 100) + "%\n" +
               "Valor Adicional Importación: $" + valorAdicionalImportacion + "\n" +
               "Seguro Adicional Mantenimiento: $" + seguroMantenimiento + "\n";
    }
}
}
