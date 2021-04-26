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
}
