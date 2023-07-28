package Ejercicio;

import java.util.Scanner;

public class LlamarPersonaWhatsapp {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite un numero telefonico");

    String numero = entrada.nextLine();

    System.out.println("https://api.whatsapp.com/send?phone=" + numero);
  }
}
