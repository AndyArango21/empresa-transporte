package model;

public class VehiculoTransporte extends Vehiculo {

    private int MaximoPasajeros;
    private int CantidadPasajero;




    public VehiculoTransporte(String placa, String modelo, String marca, String tamano, String color, int MaximoPasajeros, int CantidadPasajero ) {

        super(placa, modelo, marca, tamano, color);
        this.MaximoPasajeros = MaximoPasajeros;
        this.CantidadPasajero = CantidadPasajero;
    }
        public int getCantidadPasajero() {
        return CantidadPasajero;
    }

    public void setCantidadPasajero(int cantidadPasajero) {
        CantidadPasajero = cantidadPasajero;
    }

    public int getMaximoPasajero() {
        return MaximoPasajeros;
    }

    public void setMaximoPasajero(int maximoPasajero) {
        MaximoPasajeros = maximoPasajero;
    }



    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "MaximoPasajero=" + MaximoPasajeros +
                ", CantidadPasajero=" + CantidadPasajero +
                '}';
    }
}
