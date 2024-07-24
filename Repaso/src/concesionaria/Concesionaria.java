package concesionaria;

import java.util.ArrayList;
import java.util.List;
import repaso.Vehiculo;

public class Concesionaria {
    private List<Vehiculo> listadoVehiculos;
    private String nombreConcesionaria;

    public Concesionaria(String nombreConcesionaria) {
        this.nombreConcesionaria = nombreConcesionaria;
        this.listadoVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listadoVehiculos.add(vehiculo);
    }

    public double calcularVentasTotales() {
        double totalVentas = 0;
        for (Vehiculo vehiculo : listadoVehiculos) {
            totalVentas += vehiculo.precioFinal;
        }
        return totalVentas;
    }

    public double obtenerCostoVehiculoMasCaro() {
        double maxPrecio = Double.MIN_VALUE;
        for (Vehiculo vehiculo : listadoVehiculos) {
            if (vehiculo.precioFinal > maxPrecio) {
                maxPrecio = vehiculo.precioFinal;
            }
        }
        return maxPrecio;
    }

    public double obtenerCostoVehiculoMasBarato() {
        double minPrecio = Double.MAX_VALUE;
        for (Vehiculo vehiculo : listadoVehiculos) {
            if (vehiculo.precioFinal < minPrecio) {
                minPrecio = vehiculo.precioFinal;
            }
        }
        return minPrecio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de la Concesionaria: ").append(nombreConcesionaria).append("\n");
        sb.append("------ Listado de Vehículos ------\n");
        for (Vehiculo vehiculo : listadoVehiculos) {
            sb.append(vehiculo.toString());
        }
        sb.append("------ Resumen de Ventas ------\n");
        sb.append("Ventas Totales: $").append(calcularVentasTotales()).append("\n");
        sb.append("Costo del Vehículo Más Caro: $").append(obtenerCostoVehiculoMasCaro()).append("\n");
        sb.append("Costo del Vehículo Más Barato: $").append(obtenerCostoVehiculoMasBarato()).append("\n");
        return sb.toString();
    }
}
