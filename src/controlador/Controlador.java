package controlador;

import model.*;

import javax.swing.*;
import java.util.List;

/**
 * La clase Controlador gestiona la interacción entre los datos de propietarios, usuarios y la interfaz gráfica.
 * Proporciona las funciones necesarias para crear, visualizar y gestionar los propietarios, vehículos y usuarios en la aplicación.
 */
public class Controlador {
    private static List<Propietario> propietarios;
    private static List<Usuario> usuarios;

    /**
     * Constructor de la clase Controlador.
     *
     * @param propietarios Lista de propietarios inicializados.
     * @param usuarios Lista de usuarios inicializados.
     */
    public Controlador(List<Propietario> propietarios, List<Usuario> usuarios) {
        this.propietarios = propietarios;
        this.usuarios = usuarios;
    }

    /**
     * Muestra el menú principal de la aplicación y gestiona la selección de opciones por parte del usuario.
     */
    public static void mostrarMenu() {
        int opcion;

        do {
            String[] opciones = {"Crear Propietario", "Calcular cantidad pasajeros", "Mostrar propietarios", "Agregar pasajeros", "Mostrar pesos usuarios", "Mostrar edad", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú de Transporte",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    crearPropietario();
                    break;
                case 1:
                    mostrarPasajeros();
                    break;
                case 2:
                    mostrarPropietario();
                    break;
                case 3:
                    agregarPasajerosVehiculos();
                    break;
                case 4:
                    mostrarUsuariosPeso();
                    break;
                case 5:
                    mostrarEdad();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 6);
    }

    /**
     * Muestra en consola la información de todos los propietarios almacenados.
     */
    public static void mostrarPropietario() {
        for (Propietario prop : propietarios) {
            System.out.println(prop);
        }
    }

    /**
     * Crea un nuevo propietario solicitando los datos al usuario, luego permite asociar vehículos al propietario.
     */
    public static void crearPropietario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del propietario");
        String cedula = JOptionPane.showInputDialog("Ingrese el ID del propietario");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del propietario");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del propietario"));
        String email = JOptionPane.showInputDialog("Ingrese el email del propietario");

        Propietario propietario = new Propietario(nombre, cedula, email, edad, telefono);
        JOptionPane.showMessageDialog(null, "Propietario creado con éxito");

        int opcion;
        do {
            String[] opciones = {"Vincular vehículo de carga", "Vincular vehículo de pasajeros", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Asociar vehículos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    VehiculoCarga carga = crearVehiculoCarga();
                    propietario.setListaVehiculosAsociado(carga);
                    break;
                case 1:
                    VehiculoTransporte transporte = crearVehiculoPasajeros();
                    propietario.setListaVehiculosAsociado(transporte);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 2);

        propietarios.add(propietario);
    }

    /**
     * Crea un nuevo vehículo de carga solicitando los datos al usuario.
     *
     * @return El vehículo de carga creado.
     */
    public static VehiculoCarga crearVehiculoCarga() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo");
        String tamano = JOptionPane.showInputDialog("Ingrese el tamaño del vehículo");
        int capacidadCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga"));
        int numeroEje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejes"));

        VehiculoCarga vehiculo = new VehiculoCarga(placa, modelo, marca, color, tamano, capacidadCarga, numeroEje);
        JOptionPane.showMessageDialog(null, "Vehículo de carga creado con éxito");
        return vehiculo;
    }

    /**
     * Crea un nuevo vehículo de transporte de pasajeros solicitando los datos al usuario.
     *
     * @return El vehículo de transporte de pasajeros creado.
     */
    public static VehiculoTransporte crearVehiculoPasajeros() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo");
        String tamano = JOptionPane.showInputDialog("Ingrese el tamaño del vehículo");
        int maximoPasajero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número máximo de pasajeros"));
        int cantidadPasajero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros actual"));

        VehiculoTransporte vehiculo = new VehiculoTransporte(placa, modelo, marca, color, tamano, maximoPasajero, cantidadPasajero);
        JOptionPane.showMessageDialog(null, "Vehículo de transporte creado con éxito");
        return vehiculo;
    }

    /**
     * Muestra la cantidad de pasajeros para un vehículo de transporte, basado en su placa.
     */
    public static void mostrarPasajeros() {
        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo:");
        boolean vehiculoEncontrado = false;

        for (Propietario propi : propietarios) {
            for (Vehiculo vehiculo : propi.getListaVehiculosAsociado()) {
                if (vehiculo instanceof VehiculoTransporte && vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                    JOptionPane.showMessageDialog(null, ((VehiculoTransporte) vehiculo).getCantidadPasajero());
                    vehiculoEncontrado = true;
                    break;
                }
            }
            if (vehiculoEncontrado) {
                break;
            }
        }

        if (!vehiculoEncontrado) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Permite agregar o modificar la cantidad de pasajeros en un vehículo de transporte basado en su placa.
     */
    public static void agregarPasajerosVehiculos() {
        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehículo:");
        boolean vehiculoEncontrado = false;

        for (Propietario propi : propietarios) {
            for (Vehiculo vehiculo : propi.getListaVehiculosAsociado()) {
                if (vehiculo instanceof VehiculoTransporte && vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                    try {
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pasajeros en un día para el vehículo con placa " + vehiculo.getPlaca() + ":"));
                        ((VehiculoTransporte) vehiculo).setCantidadPasajero(cantidad);
                        vehiculoEncontrado = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para la cantidad de pasajeros.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
            }
            if (vehiculoEncontrado) {
                break;
            }
        }

        if (!vehiculoEncontrado) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Muestra en consola los nombres de los usuarios cuyo peso es mayor que el valor especificado.
     */
    public static void mostrarUsuariosPeso() {
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso mínimo de los usuarios a mostrar:"));
        for (Usuario user : usuarios) {
            if (user.getPeso() > peso) {
                System.out.println(user.getNombre());
            }
        }
    }

    /**
     * Muestra en consola los nombres de los usuarios cuya edad es mayor que 40 años.
     */
    public static void mostrarEdad() {
        int edad = 40;
        for (Usuario user : usuarios) {
            if (user.getEdad() > edad) {
                System.out.println(user.getNombre());
            }
        }
    }
}