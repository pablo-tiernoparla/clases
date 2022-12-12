package daw.programacion.clases;

public class Clases {
    public static void main( String[] args ){
        
        String id = "1";
        String nombre = "pepe";
        double saldo = 100;

        Cuenta pepe = new Cuenta(id, nombre, saldo);

        double cantidad = 200;
        pepe.credito(cantidad);
        System.out.println(pepe);

        pepe.credito(-cantidad);

        pepe.debito(cantidad);

        cantidad = 50;
        pepe.debito(cantidad);
        System.out.println(pepe);
    }//main
}//clases
