package l04;

public class Time1 {
    int seconds;
    int minutes;
    int hours;

    public int getSeconds () {
        int allSec = seconds + minutes * 60 + hours * 3600;
        return allSec;
    }

    public Time1 ( int secSec) {
        seconds = secSec;
    }

    public Time1 (int sec, int min, int h) {
        seconds = sec;
        minutes = min;
        hours = h;
    }

    public static void main (String [] args) {
        Time1 myTime = new Time1 (56, 45, 6);
        int value = myTime.getSeconds ();
        System.out.println (value );
    }
}
