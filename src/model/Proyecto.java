package model;

public class Proyecto {
    //atributos
    private String empresa;
    private String actividad;
    private Obra[] obras;
    private RecursoMaterial recursoMaterial;
    private RecursoHumano recursoHumano;
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Obra[] getObras() {
        return obras;
    }

    public void setObras(Obra[] obras) {
        this.obras = obras;
    }

    public RecursoMaterial getRecursoMaterial() {
        return recursoMaterial;
    }

    public void setRecursoMaterial(RecursoMaterial recursoMaterial) {
        this.recursoMaterial = recursoMaterial;
    }

    public RecursoHumano getRecursoHumano() {
        return recursoHumano;
    }

    public void setRecursoHumano(RecursoHumano recursoHumano) {
        this.recursoHumano = recursoHumano;
    }
    
    
    //funciones
}
