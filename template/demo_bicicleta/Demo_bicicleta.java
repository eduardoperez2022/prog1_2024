
package demo_bicicleta;


public class Demo_bicicleta {

    public static void main(String[] args) {
        
        bicicleta bici1 = new bicicleta();
        
        bici1.velocidadActual = 8;
        
        bici1.pinonActual = 2;
        
        bici1.platoActual = 3;

        System.out.println("Antes:");
        System.out.println("vel 1: " + bici1.velocidadActual);
        System.out.println("pin 1: " + bici1.pinonActual);
        System.out.println("pla 1: " + bici1.platoActual);
        
        bici1.acelerar();
        bici1.cambiarPinon(4);
        bici1.cambiarPlato(5);
        
        System.out.println("Despues:");
        System.out.println("vel 2: " + bici1.velocidadActual);
        System.out.println("pin 2: " + bici1.pinonActual);
        System.out.println("pla 2: " + bici1.platoActual);
        
    }
    
}
