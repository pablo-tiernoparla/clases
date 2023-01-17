package daw.programacion.clases;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) throws IllegalArgumentException {
        this.hour = timeLimit(24, hour);
        this.minute = timeLimit(60, minute);
        this.second = timeLimit(60, second);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) throws IllegalArgumentException {
        if (1 > hour && hour > 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException(hour + "numero invalido");
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) throws IllegalArgumentException {
        if (1 > minute && minute > 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException(hour + "numero invalido");
        }
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) throws IllegalArgumentException {
        if (1 > second && second > 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException(hour + "numero invalido");
        }
    }

    public void setTime(int hour, int minute, int second) throws IllegalArgumentException {
        if (1 > hour && hour > 23 && 0 > minute && minute > 59 && 0 > second && second > 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException(hour + "numero invalido");
        }
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
        Time a = new Time(this.hour, this.minute, this.second);
        if (this.second == 0) {
            if (this.minute == 0) {
                if (this.hour == 0) {
                    this.hour = 24;
                    this.hour += 1;
                }
                this.minute = 60;
                this.minute += 1;
            }
            this.second = 60;
        }
        this.second += 1;
        return a;
    }

    public Time previousSecond() {
        Time a = new Time(this.hour, this.minute, this.second);
        if (this.second == 0) {
            if (this.minute == 0) {
                if (this.hour == 0) {
                    this.hour = 24;
                    this.hour -= 1;
                }
                this.minute = 60;
                this.minute -= 1;
            }
            this.second = 60;
        }
        this.second -= 1;
        return a;
    }

    private String formatearAtributo(int atributo) {
        return (atributo < 10) ? "0" + atributo : Integer.toString(atributo);
    }

    private int timeLimit(int limit, int atributo) {
        if (0 < atributo && atributo < limit) {
            return atributo;
        } else {
            throw new IllegalArgumentException("numero invalido");
        }
    }
}
