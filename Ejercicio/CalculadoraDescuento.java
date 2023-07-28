package Ejercicio;

import java.util.Scanner;
public class CalculadoraDescuento {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el precio original del producto");

    double precio = entrada.nextDouble();

    System.out.println("Ingrese el porcentaje de descuento");

    double descuento = entrada.nextDouble();

    double preciofinal = precio - (precio * descuento/100);

    System.out.println("Precio final del producto es :" + preciofinal);
  }
}
