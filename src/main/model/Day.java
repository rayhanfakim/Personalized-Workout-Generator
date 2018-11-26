package main.model;

import java.util.Objects;

public class Day {
    private int day;

    public Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        return day == day1.day;
    }

    @Override
    public int hashCode() {

        return Objects.hash(day);
    }

    @Override
    public String toString() {
        return "Day " + day;
    }
}

