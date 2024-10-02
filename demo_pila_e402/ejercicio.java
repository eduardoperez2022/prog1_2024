package demo_pila_e402;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio {
    
    public void menu() {
        
        ArrayList<String> valores = new ArrayList();
        
        System.out.println("Ingrese 10 datos de texto:");
        
        int cuenta = 0;

        Scanner sc = new Scanner(System.in);
        
        while (cuenta < 10) {
            String nuevo = sc.nextLine();
            valores.add(nuevo);
            cuenta++;
        }
        
        System.out.println(valores.toString());
        
        this.invierte_orden(valores);
        
        this.nuevo_orden(valores);

    }
    
    public void invierte_orden( ArrayList<String> ar1 ) {
        
        Stack<String> st1 = new Stack();
        
        for(String ele : ar1) {
            System.out.println("ingresa:" + ele);
            st1.push(ele);
        }
        
        while(!st1.isEmpty()) {
            String dato = st1.pop();
            System.out.println(dato);
        }        
        
    }
    
    public void nuevo_orden( ArrayList<String> ar1 ) {
        
        Queue<String> queue = new LinkedList<>();
        
        for(String ele : ar1) {
            System.out.println("ingresa:" + ele);
            queue.add(ele);
        }

        while(!queue.isEmpty()) {
            String dato = queue.poll();
            System.out.println(dato);
        }        
        
        
    }

    
}
