package daw.programacion.clases;

public class Clases {
    public static void main( String[] args ){
        
        int id = 1;
        String nombre = "pepe";
        String apellido = "perez";
        double salario = 100;

        Empleado pepe = new Empleado(id, nombre, apellido, salario);

        double aumento = 5;
        pepe.raiseSalary(aumento);

        System.out.println(pepe);
    }//main
}//clases
