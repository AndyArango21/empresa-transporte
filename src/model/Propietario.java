package model;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona {

    private List<Vehiculo> listaVehiculosAsociado;


    //metodo constructor para la clase Propietario
    public Propietario(String nombre, String cedula, String email, int edad, String telefono) {
        super(nombre, cedula, email, edad, telefono);
        this.listaVehiculosAsociado = new ArrayList<Vehiculo>();
    }




    public List<Vehiculo> getListaVehiculosAsociado() {
        return listaVehiculosAsociado;
    }

    public void setListaVehiculosAsociado(Vehiculo listaVehiculosAsociado) {
        this.listaVehiculosAsociado.add(listaVehiculosAsociado);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "cedula='" + this.getCedula() + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", edad='" +  this.getEdad() + '\'' +
                '}';
    }
}
