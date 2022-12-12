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

    @Override
    public String toString() {
        return "Cuenta [id=" + id + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + "]";
    }

    public double credito(double cantidad) {
        this.saldo -= cantidad;
        return this.saldo;
    }
    
    public double debito(double cantidad) {
        if(cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }
    
    public double transferencia(Cuenta c, double cantidad) {
        if (cantidad <= this.saldo) {
            c.saldo += cantidad;
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }
}//cuenta
