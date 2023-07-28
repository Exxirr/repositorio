package Ejercicio;

import java.util.Scanner;

public class NumerosPromedio {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite el primer numero");

    int numero1 = entrada.nextInt();

    System.out.println("Digite el segundo numero");

    int numero2 = entrada.nextInt();

    System.out.println("Digite el tercer numero");

    int numero3 = entrada.nextInt();

    double promedio = (double) (numero1 + numero2 + numero3) / 3;

    System.out.println("El promedio es : " + promedio);
  }
}
