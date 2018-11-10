package main.newmodel;

import main.newui.Main;

import java.util.Objects;

public class User {
    private String name;
    private Program program;
    private int height;
    private int weight;
    private Day day;
    private double multiplier;

    public User(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.multiplier = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void saveUser() {
        // TODO find out how to generate json file for User
        Saver.save("", Main.file);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return height == user.height &&
                weight == user.weight &&
                Objects.equals(name, user.name) &&
                Objects.equals(program, user.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, program, height, weight);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", program=" + program +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
