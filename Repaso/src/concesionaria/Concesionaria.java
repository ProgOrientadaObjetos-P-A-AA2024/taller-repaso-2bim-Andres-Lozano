package concesionaria;

import repaso.Vehiculo;



import java.util.ArrayList;

public class Concesionaria {
    private ArrayList<Vehiculo> listadoVehiculos;
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
        // Uso de for tradicional con ArrayList
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            Vehiculo vehiculo = listadoVehiculos.get(i);
            totalVentas += vehiculo.precioFinal;
        }
        return totalVentas;
    }

    public double obtenerCostoVehiculoMasCaro() {
        double maxPrecio = Double.MIN_VALUE;
        // Uso de for tradicional con ArrayList
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            Vehiculo vehiculo = listadoVehiculos.get(i);
            if (vehiculo.precioFinal > maxPrecio) {
                maxPrecio = vehiculo.precioFinal;
            }
        }
        return maxPrecio;
    }

    public double obtenerCostoVehiculoMasBarato() {
        double minPrecio = Double.MAX_VALUE;
        // Uso de for tradicional con ArrayList
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            Vehiculo vehiculo = listadoVehiculos.get(i);
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
        // Uso de for tradicional con ArrayList
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            Vehiculo vehiculo = listadoVehiculos.get(i);
            sb.append(vehiculo.toString());
        }
        sb.append("------ Resumen de Ventas ------\n");
        sb.append("Ventas Totales: $").append(calcularVentasTotales()).append("\n");
        sb.append("Costo del Vehículo Más Caro: $").append(obtenerCostoVehiculoMasCaro()).append("\n");
        sb.append("Costo del Vehículo Más Barato: $").append(obtenerCostoVehiculoMasBarato()).append("\n");
        return sb.toString();
    }
}
