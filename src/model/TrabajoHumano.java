
package model;

public class TrabajoHumano {
    private String unidad;
    private float costo;
    
    public TrabajoHumano(String unidad, float costo){
        this.unidad = unidad;
        this.costo = costo;
    }
    public TrabajoHumano(String descripcion){
        this.unidad = descripcion;
    }
}
