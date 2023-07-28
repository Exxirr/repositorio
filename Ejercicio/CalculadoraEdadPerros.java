package Ejercicio;

import java.util.Scanner;

public class CalculadoraEdadPerros {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite edad humano para convertir a edad perro");

    Integer edadHumano = entrada.nextInt();

    Integer edadPerro = edadHumano * 7;

    System.out.println("Edad del perro es : " + edadPerro);

  }
}
