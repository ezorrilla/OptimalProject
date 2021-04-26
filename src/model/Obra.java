package model;

public class Obra {
    private String nombre;
    private Requerimiento requerimiento;
    private float costo;
    
    public Obra (String nombre, Requerimiento requerimiento, float costo){
        this.nombre = nombre;
        this.requerimiento = requerimiento;
        this.costo = costo;
    }
    
    public void definirVariableObra(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
