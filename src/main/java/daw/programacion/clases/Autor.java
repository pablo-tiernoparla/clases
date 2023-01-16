package daw.programacion.clases;

public class Autor {

    private String name;
    private String email;
    private char gender;

    public Autor(String name, String email, char gender) throws IllegalArgumentException {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("genero invalido");
        }
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor: nombre= " + this.name + "email= " + this.email + "genero= " + this.gender;
    }
}
