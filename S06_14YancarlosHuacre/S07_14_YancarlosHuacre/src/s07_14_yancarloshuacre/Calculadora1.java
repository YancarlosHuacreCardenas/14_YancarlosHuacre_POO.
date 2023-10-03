/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_14_yancarloshuacre;

/**
 *
 * @author Lab30
 */
public class Calculadora1 {
    // Atributo para almacenar el resultado de las operaciones
    int resultado;

    // Métodos para realizar operaciones matemáticas
    public void suma(int f, int c) {
        resultado = f + c;
        System.out.println("Suma: " + resultado);
    }

    public void resta(int f, int c) {
        resultado = f - c;
        System.out.println("Resta: " + resultado);
    }

    public void multiplicacion(int f, int c) {
        resultado = f * c;
        System.out.println("Multiplicación: " + resultado);
    }

    public void division(int f, int c) {
        if (c != 0) {
            resultado = f / c;
            System.out.println("División: " + resultado);
        } else {
            System.out.println("Error: División por cero.");
        }
    }

    public static void main(String[] args) {
        Calculadora1 calculadora = new Calculadora1();

        calculadora.suma(9, 8);
        calculadora.resta(15, 2);
        calculadora.multiplicacion(13, 5);
        calculadora.division(80, 5);

        // Crear una instancia de Calculadora2
        Calculadora2 calculadora2 = new Calculadora2();
        calculadora2.respuestas();
    }
}