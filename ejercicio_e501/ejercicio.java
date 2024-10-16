package ejercicio_e501;

public class ejercicio {
    
    public alumno[] grupo;
    
    public void menu() {
        
        this.entrada();
        this.proceso();
        this.salida();
        
    }
    
    
    public void entrada() {
        
        archivo ar = new archivo();
        ar.leer_archivo();
        
        Integer largo = ar.getContenido().size();
        
        if (largo <= 0) {
            System.out.println("Error en contenido");
            return;
        }
        
        grupo = new alumno[largo];
        
        int indice=0;
        
        for(String linea : ar.getContenido()) {
            
            String[] partes = linea.split(",");
            alumno alumnox = new alumno();
            alumnox.setPuesto(Integer.valueOf(partes[0]));
            alumnox.setApellido(partes[1]);
            alumnox.setNombre(partes[2]);
            alumnox.setDni(Long.valueOf(partes[3]));
            alumnox.setPuntaje(Integer.valueOf(partes[4]));
            
            grupo[indice] = alumnox;
            indice++;
        }
        
    }
    
    
    public void proceso() {
        
        Burbuja bur = new Burbuja();
        grupo = bur.ordenPorDni(grupo);
        
    }
    
    public void salida() {
        
        for(int x=0; x < grupo.length; x++ ) {
            alumno alx = this.grupo[x];
            System.out.println(alx.toString());
        }
        
    }
    
    
}
