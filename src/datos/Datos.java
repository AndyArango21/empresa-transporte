package datos;

import model.Propietario;
import model.Usuario;
import model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Datos proporciona métodos para inicializar los datos de propietarios y usuarios.
 * Esta clase simula la carga de datos en la aplicación, proporcionando listas predefinidas de propietarios y usuarios.
 */
public class Datos {

    /**
     * Inicializa una lista de propietarios con vehículos de transporte asociados.
     *
     * @return Lista de propietarios con vehículos asociados.
     */
    public static List<Propietario> inicializarDatos() {
        List<Propietario> lista = new ArrayList<>();

        // Crear vehículos de transporte
        VehiculoTransporte Camion1 = new VehiculoTransporte("vvt 002", "2016", "mazda", "grande", "gris", 40, 38);
        VehiculoTransporte van1 = new VehiculoTransporte("kue 961", "2020", "chevrolet", "pequeña", "azul", 10, 30);
        VehiculoTransporte autobus1 = new VehiculoTransporte("GHI789", "2017", "volvo", "Blanco", "rojo", 48, 28);
        VehiculoTransporte minivan1 = new VehiculoTransporte("JKL012", "2024", "toyota", "Negro", "blanco", 7, 35);

        // Crear propietarios
        Propietario propietario1 = new Propietario("María Gómez", "55555555", "maria@hoptmail.com", 70, "23456");
        Propietario propietario2 = new Propietario("Juan Pérez", "12345678", "juan.perez@example.com", 50, "2345");

        // Asociar vehículos a propietarios
        propietario1.setListaVehiculosAsociado(Camion1);
        propietario1.setListaVehiculosAsociado(van1);
        propietario1.setListaVehiculosAsociado(autobus1);
        propietario2.setListaVehiculosAsociado(minivan1);

        // Agregar propietarios a la lista
        lista.add(propietario1);
        lista.add(propietario2);

        return lista;
    }

    /**
     * Inicializa una lista de usuarios con datos predefinidos.
     *
     * @return Lista de usuarios con atributos predefinidos.
     */
    public static List<Usuario> inicializarDatosUsuario() {
        List<Usuario> usuarios = new ArrayList<>();

        // Crear usuarios y establecer atributos
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Juan Pérez");
        usuario1.setCedula("1234567890");
        usuario1.setEmail("juan.perez@email.com");
        usuario1.setEdad(30);
        usuario1.setTelefono("555-1234");
        usuario1.setPeso(70);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("María Gómez");
        usuario2.setCedula("0987654321");
        usuario2.setEmail("maria.gomez@email.com");
        usuario2.setEdad(25);
        usuario2.setTelefono("555-5678");
        usuario2.setPeso(60);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Carlos Ramírez");
        usuario3.setCedula("1122334455");
        usuario3.setEmail("carlos.ramirez@email.com");
        usuario3.setEdad(35);
        usuario3.setTelefono("555-9012");
        usuario3.setPeso(80);

        Usuario usuario4 = new Usuario();
        usuario4.setNombre("Ana López");
        usuario4.setCedula("5566778899");
        usuario4.setEmail("ana.lopez@email.com");
        usuario4.setEdad(77);
        usuario4.setTelefono("555-3456");
        usuario4.setPeso(55);

        Usuario usuario5 = new Usuario();
        usuario5.setNombre("Luis Fernández");
        usuario5.setCedula("6677889900");
        usuario5.setEmail("luis.fernandez@email.com");
        usuario5.setEdad(79);
        usuario5.setTelefono("555-7890");
        usuario5.setPeso(75);

        // Agregar usuarios a la lista
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);

        return usuarios;
    }
}



