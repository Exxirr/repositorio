package Ejercicio;

import java.util.Scanner;

public class CalculadoraDePropinas {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese total de la cuenta : ");

    double totalCuenta = entrada.nextDouble();

    System.out.println("Ingrese el porcentaje de propina : ");

    double propina = entrada.nextDouble();

    double montoPropina = totalCuenta * (propina / 100);

    System.out.println("Monto de la propina es : " + montoPropina);
  }
}
