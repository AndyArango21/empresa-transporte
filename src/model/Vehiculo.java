package model;

import java.util.List;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String numeroChasis;
    private Propietario propietarioAsociado;
    private List<Propietario> listaPropietariosAsociados;

    //metodo constructor para la clase Vehiculo

    public Vehiculo(String placa, String modelo, String marca, String color, String numeroChasis) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroChasis = numeroChasis;

    }




    //metodos getter y setter

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
}
