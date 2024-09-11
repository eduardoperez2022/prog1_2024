package ejercicio_304;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class proceso {
    
    public void lectura() {
        
        String nombre_archivo = "c:/temporal/plantilla_examen2.csv";
        ArrayList<String> lineas = new ArrayList();
        
        try {
            
            System.out.println("Leyendo entrada ...");
            File entrada = new File(nombre_archivo);
            Scanner scan = new Scanner(entrada);
            
            while( scan.hasNext() ) {
                String unalinea = scan.nextLine();
                lineas.add(unalinea);
            }
            
            lineas.remove(0);
            
            Double nlineas = Double.valueOf(0);
            Double suma = Double.valueOf(0);
            
            for(String linea1 : lineas) {
                String nota = linea1.substring(83).trim();
                nlineas = nlineas + 1;
                suma = suma + Double.valueOf(nota);
            }
            
            Double promedio = suma/nlineas;
            
            System.out.println("El promedio es " + promedio);
            
            Integer cuenta = Integer.valueOf(0);
            
            for(String linea1 : lineas) {
                String nota = linea1.substring(83).trim();
                if (Double.valueOf(nota) >= 25) {
                    cuenta = cuenta + 1;
                }
            }
            
            System.out.println("La cantidad de aprobados son " + cuenta);
            // xp = (cant*porc)/100
            // xp * 100 = cant * porc
            // (xp * 100) / cant = porc
            Double porcen = (cuenta * 100) / nlineas;
            
            System.out.println("El porcentaje de aprobados es " + porcen);
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    
}

