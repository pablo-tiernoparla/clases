package daw.programacion.clases;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public Time nextSecond(){
        Time a = new Time(this.hour, this.minute, this.second);        
        this.second += 1;
        return a;
    }

    public Time previousSecond(){
        Time a = new Time(this.hour, this.minute, this.second);
        this.second -= 1;   
        return a;
    }
}
