package Ejercicio;

import java.util.Scanner;

public class Promedio5Numeros {

  public static void main(String[] args) {

    int[] numeros = new int[5];

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite el primer numero :");
    numeros[0] = entrada.nextInt();

    System.out.println("Digite el segundo numero :");
    numeros[1] = entrada.nextInt();

    System.out.println("Digite el tercer numero :");
    numeros[2] = entrada.nextInt();

    System.out.println("Digite el cuarto numero :");
    numeros[3] = entrada.nextInt();

    System.out.println("Digite el quinto numero :");
    numeros[4] = entrada.nextInt();

      double suma = 0, promedio = 0;

    for (int numero : numeros) {
      suma += numero;
      promedio = suma / numeros.length;
    }
    System.out.println("Suma es : " + suma);
    System.out.println("Promedio es : " + promedio);
  }
}
