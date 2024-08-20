package model;

public class VehiculoCarga extends Vehiculo {

    private double CapacidadCarga;
    private int CapacidadPasajero;

    public VehiculoCarga(String placa, String modelo, String marca, String tamano, String color, double capacidadCarga, int capacidadPasajero) {
        super(placa, modelo, marca, tamano, color);
        CapacidadCarga = capacidadCarga;
        CapacidadPasajero = capacidadPasajero;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public int getCapacidadPasajero() {
        return CapacidadPasajero;
    }

    public void setCapacidadPasajero(int capacidadPasajero) {
        CapacidadPasajero = capacidadPasajero;
    }
}


