package model;

public class Restriccion {
    private int coefX;
    private int coefY; 
    private int R;
    private double ejeX;
    private double ejeY;
    private boolean diagonal;
    private boolean vertical;
    private boolean horizontal;
    
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

    public void tabularRecta(){        
        //Y*10 <=280
	//X*20 + Y*14 <=800
        if(coefY != 0){
            this.ejeY = R / coefY;
            this.setVertical(false);
        }else{
            this.setVertical(true);
        }
                
        if(coefX != 0){
            this.ejeX = R / coefX;
            this.setHorizontal(false);
        }else{
            this.setHorizontal(true);
        }
        
        if(this.coefX != 0 && this.coefY != 0){ this.setDiagonal(true); }
    }



}
