package aplicacion;

import controlador.Controlador;
import datos.Datos;
import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase principal de la aplicación.
 * Contiene el método `main` que inicializa los datos, configura los controladores y lanza el menú principal.
 */
public class Aplicacion {

    /**
     * Método principal de la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        // Crear instancia de Datos para manejar la inicialización de datos.
        Datos datos = new Datos();

        // Inicializar la lista de usuarios a partir de los datos.
        List<Usuario> users = datos.inicializarDatosUsuario();

        // Inicializar la lista de propietarios a partir de los datos.
        List<Propietario> propietarios = datos.inicializarDatos();

        // Mostrar en consola la cantidad de propietarios inicializados.
        System.out.println(propietarios.size());

        // Crear instancia de Controlador con los datos de propietarios y usuarios.
        Controlador controlador = new Controlador(propietarios, users);

        // Mostrar el menú principal de la aplicación.
        Controlador.mostrarMenu();

        // Imprimir en consola la información de cada propietario.
        for (Propietario prop : propietarios) {
            System.out.println(prop);
        }
    }
}