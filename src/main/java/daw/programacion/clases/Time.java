package daw.programacion.clases;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) throws IllegalArgumentException {
        checkInputs(second, minute, hour);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) throws IllegalArgumentException {
        checkInputs(0, 0, hour);
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) throws IllegalArgumentException {
        checkInputs(0, minute, 0);
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) throws IllegalArgumentException {
        checkInputs(second, 0, 0);
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) throws IllegalArgumentException {
        checkInputs(second, minute, hour);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        int[] atributosI = {this.hour, this.minute, this.second};
        String tiempo = formatearAtributo(atributosI[0]);

        for (int i = 1 ; i < atributosI.length ; i++){
            tiempo += ":" + formatearAtributo(atributosI[i]);
        }
        return tiempo;
    }

    public Time nextSecond() {
        if (this.second == 59 && this.minute == 59 && this.hour == 23){
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        } else if (this.second == 59 && this.minute == 59){
            this.second = 0;
            this.minute = 0;
            this.hour += 1;
        } else if (this.second == 59){
            this.second = 0;
            this.minute += 1;
        } else {
            this.second += 1;
        }
        return this;
    }

    public Time previousSecond() {
        if (this.second == 0 && this.minute == 0 && this.hour == 0){
            this.second = 59;
            this.minute = 59;
            this.hour = 23;
        } else if (this.second == 0 && this.minute == 0){
            this.second = 59;
            this.minute = 59;
            this.hour--;
        } else if (this.second == 0){
            this.second = 59;
            this.minute--;
        } else {
            this.second--;
        }
        return this;
    }

    private String formatearAtributo(int atributo) {
        return (atributo < 10) ? "0" + atributo : Integer.toString(atributo);
    }

    private void checkInputs(int sec, int min, int hora) throws IllegalArgumentException{
        if(!(sec >= 0 && sec <= 59) || !(min >= 0 && min <= 59) || !(hora >= 0 && hora <= 23)){
            throw new IllegalArgumentException();
        }
    }
}