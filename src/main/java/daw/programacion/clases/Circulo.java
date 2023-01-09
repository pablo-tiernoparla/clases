package daw.programacion.clases;

public class Circulo {

    private double radio = 1.0;

    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString(){
        return "Circulo: radio: " + this.radio;
    }
}
