package main.newmodel;

import java.util.Objects;

public class Exercise implements Comparable {

    private String name;
    private int weightExercise;
    private int sets;
    private int rest;

    public Exercise(String name, int weightExercise, int sets, int rest) {
        this.name   = name;
        this.weightExercise = weightExercise;
        this.sets   = sets;
        this.rest   = rest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public double getWeightExercise() {
        return weightExercise;
    }

    public void setWeightExercise(int weightExercise) {
        this.weightExercise = weightExercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return sets == exercise.sets &&
                rest == exercise.rest &&
                Objects.equals(name, exercise.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sets, rest);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='"  + name + '\'' +
                ", sets=" + sets +
                ", rest=" + rest +
                '}';
    }

    public void printExercise(User user) {
        System.out.println(name + user.getWeight() + "...");
    }


    @Override
    public int compareTo(Object o) {
        Exercise other = (Exercise) o;
        return name.compareTo(other.name);
    }
}
