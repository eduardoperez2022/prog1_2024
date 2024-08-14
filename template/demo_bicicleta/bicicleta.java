package demo_bicicleta;

public class bicicleta {
    
    // atributos
    public int velocidadActual;
    
    public int platoActual;
    
    public int pinonActual;
    
    // metodos
    public void acelerar() {
        this.velocidadActual = this.velocidadActual * 2;
    }

    public void frenar() {
        this.velocidadActual = this.velocidadActual / 2;
    }
    
    public void cambiarPlato(int plato) {
        this.platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        this.pinonActual = pinon;
    }
    
    
}
