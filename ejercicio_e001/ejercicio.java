
package ejercicio_e001;

import java.util.Scanner;

public class ejercicio {
    
    public void menu() {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 a 12:");
        int numero = sc.nextInt();
        
        int dias = this.cantidad_dias(numero);
        
        String nombre_mes = this.nombre_mes(numero);
        
        System.out.println("El mes " + numero + " tiene " + dias + " dias.");
        
        System.out.println("El mes de " + nombre_mes + " tiene " + dias + " dias.");
    }
    
    public int cantidad_dias(int nmes) {
        
        int cantidad=0;
        
        int [] cants = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        int indice_real = nmes-1;
        
        cantidad = cants[indice_real];
        
        return cantidad;
    }
    
    public String nombre_mes(int nmes) {
        
        String salida="";
        
        String [] nombres = new String[12];
        
        nombres[0] = "enero";
        nombres[1] = "febrero";
        nombres[2] = "marzo";
        nombres[3] = "abril";
        
        nombres[4] = "mayo";
        nombres[5] = "junio";
        nombres[6] = "julio";
        nombres[7] = "agosto";
        
        nombres[8] = "septiembre";
        nombres[9] = "octubre";
        nombres[10] = "noviembre";
        nombres[11] = "diciembre";
        
        int indice_real = nmes-1;
        
        salida = nombres[indice_real];
        
        return salida;
    }



}
