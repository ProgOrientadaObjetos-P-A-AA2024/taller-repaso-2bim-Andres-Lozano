/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

public abstract class Vehiculo {


    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador pro, String m, double p) {
        propietario = pro;
        marca = m;
        precioBase = p;
    }

    public abstract void calcularPrecioFinal();
    public double obtenerpreciofinal(){
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getClass().getSimpleName() + "\n" +
               "Propietario: " + propietario + "\n" +
               "Marca: " + marca + "\n" +
               "Precio Base: $" + precioBase + "\n" +
               "Precio Final: $" + precioFinal + "\n";
    }
}
