package ejercicio_e302;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class proceso {
    
    public void lectura() {
        
        // objetos de lectura y variables
        // objetos para lectura
        String nombre_boca1 = "C:/temporal/boca_2011.txt";
        String nombre_boca2 = "C:/temporal/boca_2012.txt";
        
        // ArrayList de trabajo
        ArrayList<String> entrada_2011 = new ArrayList();
        ArrayList<String> entrada_2012 = new ArrayList();
        ArrayList<String> salida = new ArrayList();
        
        System.out.println("Leyendo entrada");
        
        // leer los dos archivos a sendos ArrayList
        try {
            File origen = new File(nombre_boca1);
            Scanner scan = new Scanner(origen);
            String line;
            while (scan.hasNext()) {
                line = scan.nextLine();
                entrada_2011.add(line);
            }

            File origen2 = new File(nombre_boca2);
            Scanner scan2 = new Scanner(origen2);
            String line2;
            while (scan2.hasNext()) {
                line2 = scan2.nextLine();
                entrada_2012.add(line2);
            }
        }
        catch (Exception e) {
                e.printStackTrace();
        }
        
        // recorrer ambos ArrayList, comparando lineas, 
        // guardar lineas iguales en ArrayList de salida
        
//        Integer largo = entrada_2011.size();
//        for(int x=0; x < largo; x++) {
//            String linea1 = entrada_2011.get(x);
//            String linea2 = entrada_2012.get(x);
//            if (linea1.equals(linea2)) {
//                salida.add(linea1);
//            }
//        }
        
        for(String elem : entrada_2011) {
            if (entrada_2012.contains(elem)) {
                  salida.add(elem);
            }
        }


//        for(String elem : entrada_2011) {
//            for(String elem2 : entrada_2012) {
//                if (elem.equals(elem2)) {
//                  salida.add(elem);
//                  break;
//                }
//            }
//        }


        // mostrar la salida (ArrayList de salida)
        System.out.println("Jugadores repetidos:");
        // System.out.println(salida);
        for(String sal : salida) {
            System.out.println(sal);
        }
        
    }
    
    
}
