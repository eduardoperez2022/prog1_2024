package excepcion_demo1;

import java.util.Scanner;

public class ejercicio {

    /*
  Modificar el programa de esta forma:
    1 - el tipo de variable a leer debe ser tipo string
    2 - el programa debe mostrar el cuadrodo del numero ingresado
     */
    public void menu() {

        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {
            try {
                System.out.println("Ingrese un numero:");

                num = sc.nextLine();

                Integer numero = Integer.parseInt(num);

                Integer cuadrado = numero * numero;

                System.out.println("El cuadrado es: " + cuadrado);
                break;
            } 
            
            catch (NumberFormatException e) {
                // System.out.println(e.getMessage());
                // e.printStackTrace();
                System.out.println("El formato no es numerico. Verifique !");
                System.out.println("Vuelva a intentar ...");
            }

            finally {
               System.out.println("Siempre se ejecuta ...");
            }

        }
        

    }

}
