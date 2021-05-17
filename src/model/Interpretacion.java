
package model;

public class Interpretacion {
    private String objetivo;
    private String[] retricciones;

    public Interpretacion(String objetivo, String[] retricciones) {
        this.objetivo = objetivo;
        this.retricciones = retricciones;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(double X, double Y, int Z) {
        this.objetivo = "Deben producirse " + X + "";
    }

    public String[] getRetricciones() {
        return retricciones;
    }

    public void setRetricciones(String[] retricciones) {
        this.retricciones = retricciones;
    }
    
}
