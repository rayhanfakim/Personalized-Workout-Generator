package main.model;


import java.util.List;
import java.util.Map;

public class TwoDayProgram extends Program {
    private int days;

    public TwoDayProgram(String name, Map<Day, List<Exercise>> exercises) {
        super(name, exercises, 2);
    }

    public int getDays() {
        return days;
    }

    @Override
    public void print() {
        System.out.println("Two day program: " + getName());
    }
}
