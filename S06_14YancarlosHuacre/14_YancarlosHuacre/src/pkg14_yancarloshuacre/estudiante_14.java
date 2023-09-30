/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_yancarloshuacre;

import java.util.Date;

/**
 *
 * @author Yancarlos
 */
public class estudiante_14 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor sin parámetros (sobrecarga de constructores)
    public estudiante_14() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor con parámetros (sobrecarga de constructores)
    public estudiante_14(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre (método con valor de retorno)
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que muestra la fecha y hora actual (método con valores de retorno)
    public String mostrarFechaYHora() {
        Date fechaHoraActual = new Date();
        return "Fecha y hora actual: " + fechaHoraActual;
    }
}
