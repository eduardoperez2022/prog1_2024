package excepcion_demo1;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {

    public void menu() throws NumberFormatException {

        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {

            System.out.println("Ingrese un numero:");

            num = sc.nextLine();

            Integer numero = Integer.parseInt(num);

            Integer cuadrado = numero * numero;

            System.out.println("El cuadrado es: " + cuadrado);
            break;
        }

    }

}
