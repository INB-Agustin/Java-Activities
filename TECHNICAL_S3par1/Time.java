
package TECHNICAL_S3par1;
class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Compare the current time with another time object
    public int compareTo(Time other) {
        if (this.hours != other.hours) {
            return Integer.compare(this.hours, other.hours);
        } else if (this.minutes != other.minutes) {
            return Integer.compare(this.minutes, other.minutes);
        } else {
            return Integer.compare(this.seconds, other.seconds);
        }
    }

    // Calculate the absolute difference in seconds between two Time objects
    public int differenceInSeconds(Time other) {
        int totalSeconds1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSeconds2 = other.hours * 3600 + other.minutes * 60 + other.seconds;
        return Math.abs(totalSeconds1 - totalSeconds2);
    }
}
