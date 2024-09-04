package ejercicio_e301;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class proceso {
    
    public void lectura() {
        
        // objetos para lectura
        String nombre_archivo = "C:/temporal/medallas_2024.dat";
        
        // ArrayList de trabajo
        ArrayList<String> entrada = new ArrayList();
        ArrayList<String> salida_oro = new ArrayList();
        ArrayList<String> salida_plata = new ArrayList();
        ArrayList<String> salida_bronce = new ArrayList();
        
        System.out.println("Leyendo entrada");
        
        // lectura del archivo para guardar en ArrayList
        try {
            File origen = new File(nombre_archivo);
            Scanner scan = new Scanner(origen);
            String line;
            while (scan.hasNext()) {
                line = scan.nextLine();
                entrada.add(line);
            }            
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        
        // leer linea por linea, enviar al ArrayList de salida correspondiente
        for( String unalinea : entrada ) {
            if (unalinea.contains("Oro")) {
                salida_oro.add(unalinea);
            }
            else if (unalinea.contains("Plata")) {
                salida_plata.add(unalinea);
            }
            else if (unalinea.contains("Bronce")) {
                salida_bronce.add(unalinea);
            }
        }
        
        System.out.println("Generando salida");
        
        // en base a los tres ArrayList, generamos los archivos de salida
        String archivo_oro = "C:/temporal/salida_oro.dat";
        String archivo_plata = "C:/temporal/salida_plata.dat";
        String archivo_bronce = "C:/temporal/salida_bronce.dat";
        
        try {
            PrintWriter writer = new PrintWriter(archivo_oro);
            for( String otralinea : salida_oro ) {
                writer.println(otralinea);
            }
            writer.flush();
            
            PrintWriter writer2 = new PrintWriter(archivo_plata);
            for( String otralinea : salida_plata ) {
                writer2.println(otralinea);
            }
            writer2.flush();
            
            PrintWriter writer3 = new PrintWriter(archivo_bronce);
            for( String otralinea : salida_bronce ) {
                writer3.println(otralinea);
            }
            writer3.flush();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
