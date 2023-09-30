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
public class calculadora_14 {

    // Métodos de suma con sobrecarga
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Métodos de resta con sobrecarga
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Métodos de multiplicación con sobrecarga
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Métodos de división con sobrecarga
    public int dividir(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0.0;
        }
    }
}
