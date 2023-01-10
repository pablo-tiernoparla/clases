package daw.programacion.clases;

public class Libro {

    private String name;
    private Autor author;
    private double price;
    private int qty;

    public Libro(String name, Autor author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Libro(String name, Autor author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Autor getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Libro [name=" + this.name + ", author=" + this.author.toString() + ", price=" + this.price + ", qty=" + this.qty + "]";
    }
}
