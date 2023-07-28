package Ejercicio;

import java.util.Scanner;

public class ConversosrMillasAKilometros {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite la distancia en millas");

    double millas = entrada.nextDouble();

    double kilometros = millas * 1.60934;

    System.out.println("Millas convertido a Kilometros es : " + kilometros);
  }
}
