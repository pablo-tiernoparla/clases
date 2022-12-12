package daw.programacion.clases;

public class Factura {

    private String id;
    private String desc;
    private int cantidad = 0;
    private double precioUnitario;
    
    public Factura(String id, String desc, int cantidad, double precioUnitario) {
        this.id = id;
        this.desc = desc;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", desc=" + desc + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
                + "]";
    }

    public double getTotal() {
        return this.precioUnitario * this.cantidad;
    }    
    
}
