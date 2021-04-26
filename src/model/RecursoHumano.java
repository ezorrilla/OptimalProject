
package model;

public class RecursoHumano extends TrabajoHumano {

    private int disponibilidad;
    //sobracarga de metodos
    public RecursoHumano(String unidad, float costo, int disponibilidad){
        super(unidad, costo);
        this.disponibilidad = disponibilidad;
    }
    
    public RecursoHumano(String unidad, int disponibilidad){
        super(unidad);
        this.disponibilidad = disponibilidad;
    }
    
    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
