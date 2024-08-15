package ejercicio_e003;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio {
    
    
    public void menu() {
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un numero de 4 cifras:");
//        int numero = sc.nextInt();
        
        double respuesta = this.calculo();
        
        System.out.println("El promedio es " + respuesta);
        
    }
    
    public double calculo() {
        
        double respuesta=0;
        
        int [] numeros = new int[10];
        
        for (int x=0; x < numeros.length; x++) {
            int numero_alea = (int) (Math.random() * 100) + 1;
            numeros[x] = numero_alea;
        }
        
        int suma=0;
        for (int x=0; x < numeros.length; x++) {
            suma = suma + numeros[x];
        }
        
        String det = Arrays.toString(numeros);
        System.out.println("det:" + det);
        
        respuesta = suma / numeros.length;
        
        return respuesta;
    }
    
    
    
    
}
