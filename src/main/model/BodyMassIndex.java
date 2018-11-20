package main.model;

public class BodyMassIndex {

    protected int weight;
    protected int height;
    protected double BMI;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BodyMassIndex(int weight, int height) {
        this.weight = weight;
        this.height = height;

        double BMI = ((weight / height) / height);
        System.out.println("\nYour BMI is:" + BMI);

    }

}
