/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_yancarloshuacre;

/**
 *
 * @author Yancarlos
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Estudiante_14 usando el constructor sin parámetros
        estudiante_14 estudiante1 = new estudiante_14();

        // Crear una instancia de Estudiante_14 usando el constructor con parámetros
        estudiante_14 estudiante2 = new estudiante_14("Juan", 20);

        // Mostrar los datos de los estudiantes
        System.out.println("Estudiante 1 - Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad());
        System.out.println("Estudiante 2 - Nombre: " + estudiante2.getNombre() + ", Edad: " + estudiante2.getEdad());

        // Mostrar la fecha y hora actual usando el método de Estudiante_14
        String fechaYHora = estudiante2.mostrarFechaYHora();
        System.out.println(fechaYHora);

        // Crear una instancia de Calculadora_14
        calculadora_14 calculadora = new calculadora_14();

        // Realizar algunas operaciones matemáticas utilizando la Calculadora_14
        int resultadoSuma = calculadora.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        double resultadoResta = calculadora.restar(8.5, 3.2);
        System.out.println("Resta: " + resultadoResta);
    }
}
