package model;

public class RecursoMaterial extends Material{
    private int stock;
    
    public RecursoMaterial(String descripcion, float precio, int stock){
        super(descripcion, precio);
        this.stock = stock;
    }
    public RecursoMaterial(String descripcion, int stock){
        super(descripcion);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
