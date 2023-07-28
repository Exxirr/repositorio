package Ejercicio;

import java.util.Scanner;

public class ContarUnaHistoria {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Habia una vez un gran aventuro que recien iniciaba y se encontraba en el bosque que habia doble direcciones");

    System.out.println("Que puerta eliges 1 o 2 ");

    int puerta = entrada.nextInt();

    if(puerta == 1){
      System.out.println("Ingresa por la puerta izquierda a una zona oscura y peligrosa");
    }

    if(puerta == 2){
      System.out.println("Ingresa por la puerta derecha a una zona iluminada pero sospechosa");
    }


    System.out.println("Tienes 2 caminos de nuevos ");

    int camino = entrada.nextInt();

    if(camino == 1){
      System.out.println("LLega a un pueblo cerca de su casa");
    }

    if(camino == 2){
      System.out.println("Se pierde en un laberinto sin salida");
    }

    System.out.println("Por ultimo tienes 2 puertas");

    int puertaFinal = entrada.nextInt();

    if(puertaFinal == 1){
      System.out.println("LLego a su casa a salvo");
    }

    if(puertaFinal == 2){
      System.out.println("Pasó la noche en el bosque");
    }
  }
}
