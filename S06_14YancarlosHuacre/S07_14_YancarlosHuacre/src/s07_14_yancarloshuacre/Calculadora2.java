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
public class Calculadora2 {
    
    public static int sumar(int c, int d) {
    return c + d;
  }

  public static int restar(int c, int d) {
    return c - d;
  }

  public static int multiplicar(int c, int d) {
    return c * d;
  }

  public static int dividir(int c, int d) {
    return c / d;
  }
  public void respuestas(){
    int suma = sumar(9, 6);
    System.out.println("La suma es: "+suma);
    int resta = restar(9, 6);
    System.out.println("9 - 6 = " + resta);
    int multiplicacion = multiplicar(9, 6);
    System.out.println("9 * 6 = " + multiplicacion);
    int division = dividir(9, 6);
    System.out.println("9 / 6 = " + division);
  }
   
}