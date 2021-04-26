package model;

public class Material {
    private String descripcion;
    private float precio;
    
    public Material(String descripcion, float precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Material(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
