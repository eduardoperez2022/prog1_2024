
package ejercicio_e002;

import java.util.Scanner;

public class ejercicio {
    
    public void menu() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 cifras:");
        int numero = sc.nextInt();
        
        boolean respuesta = this.busca_numero(numero);
        
        if (respuesta) {
            System.out.println("El " + numero + " fue encontrado.");
        }
        else {
            System.out.println("El " + numero + " no fue encontrado.");
        }
        
    }
    
    public boolean busca_numero(int nnum) {
        
        boolean existe=false;
        
        int[] my_array1 = { 1789, 2035, 1899, 1456, 2013,
                            1458, 2458, 1254, 1472, 2365,
                            1456, 2265, 1457, 2456 };
        
        for (int elemento : my_array1) {
            if (elemento == nnum) {
                existe = true;
            }
        }
        
        return existe;
    }
    


}
