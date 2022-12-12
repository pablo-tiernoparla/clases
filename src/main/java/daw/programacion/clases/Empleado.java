package daw.programacion.clases;

public class Empleado {
    
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Empleado(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }//Employee

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + "]";
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double getAnualSalary() {
        return this.salary * 12;
    }

    public double raiseSalary(double percentage) {
        this.salary = this.salary * 1 + (percentage / 100);
        return this.salary;
    }
}//empleado
