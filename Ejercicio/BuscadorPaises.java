package Ejercicio;

import java.util.Scanner;

public class BuscadorPaises {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese nombre de un pais");

    String pais = entrada.nextLine();

    System.out.println("https://www.google.com/maps/search/" + pais);
  }
}
