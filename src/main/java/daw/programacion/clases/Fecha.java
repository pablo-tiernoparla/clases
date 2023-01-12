package daw.programacion.clases;

public class Fecha {
    
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void setDay(int day) {
        if (day > 0 && day < 32){
            this.day = day;
        }
        throw new Exception("day must be between 1 and 31");
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13){
            this.month = month;
        }
        throw new datoMalAsignado(month + "must be between 1 and 12");
    }

    public void setYear(int year) {
        if (year > 1900 && year < 9999){
            this.year = year;
        }
        throw new datoMalAsignado(year + "must be between 1900 and 9999");
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }    
}
