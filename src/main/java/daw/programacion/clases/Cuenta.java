package daw.programacion.clases;

public class Cuenta {
    
    private String id;
    private String nombreCliente;
    private double saldo = 0;
    
    public Cuenta(String id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public Cuenta(String id, String nombreCliente, double saldo) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public String getId() {
        return this.id;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    
    
}//cuenta
