package ejercicio_e501;

public class alumno {

    private Integer puesto;
    private String nombre;
    private String apellido;
    private Long dni;
    private Integer puntaje;

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "alumno{" + "puesto=" + puesto + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", puntaje=" + puntaje + '}';
    }

}
