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
}
