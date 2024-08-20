package model;

public class Persona {
    private String nombre;
    private String cedula;
    private String email;
    private int edad;
    private String telefono;
    public Persona(String nombre, String cedula, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;

    }

    public Persona() {

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
