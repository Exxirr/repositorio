package Ejercicio;

import java.util.Scanner;

public class BuscadorDeTwwets {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite nombre de una celebridad :");

    String celebridad = entrada.nextLine();

    System.out.println("https://twitter.com/search?q=" + celebridad);
  }
}
