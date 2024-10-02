package demo_cuit;

import java.util.Scanner;

public class Demo_cuit {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un cuit:");
        
        Scanner sc = new Scanner(System.in);
        String nuevo = sc.nextLine();

        cuit_2024 cu = new cuit_2024();
        
        // cu.setCuit("23203334445");
        cu.setCuit(nuevo);
        
        // String valor = cu.getCuit();
        String valor = cu.getCuitFormato();
        
        System.out.println("Cuit:" + valor);
        
        String valor_v2 = cu.getCuitFormato_v2();

        System.out.println("Cuit v2:" + valor_v2);

        
    }
    
}
