package model;

public class Requerimiento {
    public Material material;
    public TrabajoHumano trabajoHumano;
    
    public void definirMaterial(String descripcion){
        Material material = new Material(descripcion);        
    }
    public void definirTrabajoHumano(String unidad){
        TrabajoHumano trabajoHumano = new TrabajoHumano(unidad);        
    }
}
