package main.newmodel;

import main.newui.Setup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Program {

    private String name;
    private Map<Day, List<Exercise>> exercises;

    public static final Program DEFAULT_TWO_DAY_PROGRAM   = new TwoDayProgram("Default Two Days Program", Setup.twoDaysProgramExerciseMap);
    public static final Program DEFAULT_THREE_DAY_PROGRAM = new ThreeDayProgram("Default Three Days Program", Setup.threeDaysProgramExerciseMap);


    public Program(String name, Map<Day, List<Exercise>> exercises) {
        this.name = name;
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Day, List<Exercise>> getExercises() {
        return exercises;
    }

    public void setExercises(Map<Day, List<Exercise>> exercises) {
        this.exercises = exercises;
    }

    private void addDay(Day day){
        exercises.put(day, new ArrayList<>());
    }

    private void addExerciseToDay(Day d, Exercise ex){
        exercises.get(d).add(ex);

    }

}
