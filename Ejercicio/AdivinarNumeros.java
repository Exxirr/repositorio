package Ejercicio;

import java.util.Scanner;

public class AdivinarNumeros {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int numero = (int) (Math.random() * 100);

    System.out.println("Adivina el numero aleatorio : ");

    int adivina = entrada.nextInt();

    System.out.println("Numero es : " + numero);

    if(adivina == numero){
      System.out.println("Lo lograste");
    }else{
      System.out.println("Para la proxima ");
    }


  }
}
