package daw.programacion.clases;

public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) throws IllegalArgumentException{
        if (1 > day && day > 31 && 1 > month && month > 12 && 1998 > year && year > 9999) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("numeros invalidos");
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) throws IllegalArgumentException {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            throw new IllegalArgumentException(day + "must be between 1 and 31");
        }
    }

    public void setMonth(int month) throws IllegalArgumentException {
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            throw new IllegalArgumentException(month + "must be between 1 and 12");
        }
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year > 1900 && year < 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException(year + "must be between 1900 and 9999");
        }
    }

    public void setDate(int day, int month, int year) throws IllegalArgumentException {
        if (1 > day && day > 31 && 1 > month && month > 12 && 1998 > year && year > 9999) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("numeros invalidos");
        }
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
