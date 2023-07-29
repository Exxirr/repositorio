package Ejercicio;

import java.util.Scanner;

public class NumeroMayoryMenor {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int mayor = 0 , menor = 0;

    System.out.println("Digite el primer numero ");

    int numero1 = entrada.nextInt();

    System.out.println("Digite el segundo numero ");

    int numero2 = entrada.nextInt();

    System.out.println("Digite el tercer numero");

    int numero3 = entrada.nextInt();

    //Numero mayor
    if(numero1 > numero2 && numero1 > numero3){
      mayor = numero1;
    }else if(numero2 > numero1 && numero2 > numero3){
      mayor = numero2;
    }else if(numero3 > numero1 && numero3 > numero2){
      mayor = numero3;
    }

    //Numero menor
    if(numero1 < numero2 && numero1 < numero3){
      menor = numero1;
    }else if(numero2 < numero1 && numero2 < numero3){
      menor = numero2;
    }else if(numero3 < numero1 && numero3 < numero2){
      menor = numero3;
    }

    System.out.println("Numero mayor es : " + mayor);
    System.out.println("Numero menor es : " + menor);
  }
}
