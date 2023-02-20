public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public String toString() {
        String hourString = String.format("%02d", hour);
        String minuteString = String.format("%02d", minute);
        String secondString = String.format("%02d", second);
        return hourString + ":" + minuteString + ":" + secondString;
    }

    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time(4, 5, 6);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        t2.nextSecond().nextSecond().nextSecond();
        System.out.println("Hour: " + t2.getHour());
        System.out.println("Minute: " + t2.getMinute());
        System.out.println("Second: " + t2.getSecond());
        Time t3 = new Time(23, 59, 58);
        System.out.println(t3.toString());
        t3.nextSecond();
        System.out.println(t3.toString());
        t3.nextSecond();
        System.out.println(t3.toString());
        t3.previousSecond().previousSecond().previousSecond().previousSecond();
        System.out.println(t3.toString());
        Time t4 = new Time(0, 0, 0);
        System.out.println(t4.toString());
        t4.previousSecond();
        System.out.println(t4.toString());
        t4.previousSecond();
        System.out.println(t4.toString());
        t4.previousSecond();
        System.out.println(t4.toString());
    }
}
