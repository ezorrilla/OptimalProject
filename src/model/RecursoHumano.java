
package model;

public class RecursoHumano extends TrabajoHumano {
    private int disponibilidad;
    
    public RecursoHumano(String unidad, float costo, int disponibilidad){
        super(unidad, costo);
        this.disponibilidad = disponibilidad;
    }
    public RecursoHumano(String unidad, int disponibilidad){
        super(unidad);
        this.disponibilidad = disponibilidad;
    }
}
