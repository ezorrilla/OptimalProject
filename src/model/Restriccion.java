package model;

public class Restriccion {
    private String descripcion;
    private int coefX;
    private int coefY;
    private String limite;
    private int R;
    private double ejeX;
    private double ejeY;
    private boolean diagonal;
    private boolean vertical;
    private boolean horizontal;
    
    public Restriccion(){}
    
    public Restriccion(String descripcion, int coefX, int coefY, String limite, int R, double ejeX, double ejeY, boolean diagonal, boolean vertical, boolean horizontal) {
        this.descripcion = descripcion;
        this.coefX = coefX;
        this.coefY = coefY;
        this.limite = limite;
        this.R = R;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.diagonal = diagonal;
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public String toString() {
        return "Restriccion{" + "descripcion=" + descripcion + ", coefX=" + coefX + ", coefY=" + coefY + ", R=" + R + ", ejeX=" + ejeX + ", ejeY=" + ejeY + ", diagonal=" + diagonal + ", vertical=" + vertical + ", horizontal=" + horizontal + '}';
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
    
    public int getCoefX() {
        return coefX;
    }

    public void setCoefX(int coefX) {
        this.coefX = coefX;
    }

    public int getCoefY() {
        return coefY;
    }

    public void setCoefY(int coefY) {
        this.coefY = coefY;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public double getEjeX() {
        return ejeX;
    }

    public void setEjeX(float ejeX) {
        this.ejeX = ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public void setEjeY(float ejeY) {
        this.ejeY = ejeY;
    }
    
    public boolean isDiagonal() {
        return diagonal;
    }

    public void setDiagonal(boolean diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Métodos
    public void tabularRecta(){        
        //Y*10 <=280
	//X*20 + Y*14 <=800
        if(coefY != 0){
            this.ejeY = (double) R / coefY;
            this.setVertical(false);
        }else{
            this.setVertical(true);
        }
                
        if(coefX != 0){
            this.ejeX = (double) R / coefX;
            this.setHorizontal(false);
        }else{
            this.setHorizontal(true);
        }
        
        if(this.coefX != 0 && this.coefY != 0){ this.setDiagonal(true); }
    }

}
