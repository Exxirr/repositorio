package Ejercicio;

import java.util.Scanner;

public class Mostrar5Numeros {

  public static void main(String[] args) {
    int[] numeros = new int[5];
    ingresarNumeros(numeros);
    mostrarNumeros(numeros);
    numeroMayor(numeros);
    numeroMenor(numeros);
  }


  public static void ingresarNumeros(int[] numeros){

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
  }

  public static void mostrarNumeros(int[] numeros){
    System.out.println("Los numeros agregados son :");
    for (int numero : numeros) {
      System.out.println(numero);
    }

  }

  public static void numeroMayor(int[] numeros){
      int mayor = 0;
    for (int numero : numeros) {
      if (numero > mayor) {
        mayor = numero;
      }
    }
    System.out.println("Numero mayor es : " + mayor);
  }


  public static void numeroMenor(int[] numeros){
    int menor = numeros[0];

    for (int numero : numeros)
      if (numero < menor) {
        menor = numero;
      }
    System.out.println("Numero menor es : " + menor);

  }


}
