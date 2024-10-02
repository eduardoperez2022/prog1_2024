package demo_cuit;

public class cuit_2024 {
    
    private String cuit;
    private int LARGO_CUIT = 11;
    private boolean isvalid = false;
    
    public String getCuitFormato() {
        
        String formato="";
        
        if (!this.isvalid) {
            return formato;
        }
        
        String elcuit = this.cuit;
        
        formato = elcuit.substring(0,2).concat("-").concat(elcuit.substring(2,10))
                .concat("-").concat(elcuit.substring(10))  ;
        
        return formato;
        
    }


    public String getCuitFormato_v2() {
        
        String formato="";
        
        if (!this.isvalid) {
            return formato;
        }
        
        StringBuffer sb = new StringBuffer();
        
        String elcuit = this.cuit;
        
        sb.append(elcuit.substring(0,2));
        sb.append("-");
        sb.append(elcuit.substring(2,10));
        sb.append("-");
        sb.append(elcuit.substring(10));
        
        formato = sb.toString();
        
        return formato;
        
    }

    
    public void setCuit(String nuevo_cuit) {
        
        this.cuit = "";
        
        if (nuevo_cuit.length() != this.LARGO_CUIT) {
            System.out.println("Largo de dato es incorrecto !");
            return;
        }
        
        this.cuit = nuevo_cuit;
        this.isvalid = true;
    }
            
    public String getCuit() {
        return this.cuit;
    }
    
    
    
}
