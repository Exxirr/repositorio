package Ejercicio;


import java.util.Random;
import java.util.Scanner;

public class JuegoPiedraPapelTijera {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    Random random = new Random();

    System.out.println("piedra, papel o tijera");

    String usuario = entrada.nextLine().toLowerCase();

    int eleccion = random.nextInt(3);
    String eleccionPc;

         switch (eleccion) {
           case 0 -> eleccionPc = "piedra";
           case 1 -> eleccionPc = "papel";
           case 2 -> eleccionPc = "tijera";
           default -> eleccionPc = "";
         }

    System.out.println("El usuario escogio : " + usuario);

    System.out.println("La computadora eligio : " + eleccionPc);

    if(usuario.equals(eleccionPc)){
      System.out.println("Es un empate");
    }
    else if((usuario.equals("piedra") && eleccionPc.equals("tijera")) ||
            (usuario.equals("papel") && eleccionPc.equals("piedra")) ||
            (usuario.equals("tijera") && eleccionPc.equals("papel"))) {
      System.out.println("Gana el usuario");
    }
    else{
      System.out.println("Gana la computadora ");
    }
  }
}
