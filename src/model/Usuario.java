package model;

public class Usuario extends Persona{
    private int peso;

    public Usuario() {

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Usuario (String nombre, String cedula, String email, int edad, String telefono, int peso){
        super(nombre, cedula, email, edad, telefono);
        this.peso = peso;



    }




}
