package daw.programacion.clases;

public class Rectangulo {

    private double length = 1.0;
    private double width = 1.0;

    public Rectangulo(){}

    public Rectangulo(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }    
    
    public double getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public String toString(){
        return "Rectangulo: largo: " + this.length + " ancho: " + this.width; 
    }
}
