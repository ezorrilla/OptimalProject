package model;

public class Requerimiento {
    private int cantidadRMaterial;
    private int cantidadRHumano;

    public Requerimiento(int cantidadRMaterial, int cantidadRHumano) {
        this.cantidadRMaterial = cantidadRMaterial;
        this.cantidadRHumano = cantidadRHumano;
    }
    
    public int getCantidadRMaterial() {
        return cantidadRMaterial;
    }

    public void setCantidadRMaterial(int cantidadRMaterial) {
        this.cantidadRMaterial = cantidadRMaterial;
    }

    public int getCantidadRHumano() {
        return cantidadRHumano;
    }

    public void setCantidadRHumano(int cantidadRHumano) {
        this.cantidadRHumano = cantidadRHumano;
    }
}
