package main.model;

import java.util.List;
import java.util.Map;

public class ThreeDayProgram extends Program {
    private int days;

    public ThreeDayProgram(String name, Map<Day, List<Exercise>> exercises) {
        super(name, exercises, 3);
    }

    public int getDays() {
        return days;
    }

    @Override
    public void print() {
        System.out.println("Three day program: " + getName());
    }
}
