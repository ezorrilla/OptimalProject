
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

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
