//package main.model;
//
//import main.newmodel.Timer;
//import main.newui.Interactions;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Objects;
//
//public class TwoDayProgram extends Program {
//
//    private int restCompound   ;
//    private int restAccessories;
//    private int setsCompound   ;
//    private int setsAccessories; // TODO change to 4 and put it as final: final int setsAccessories = 4;
//
//    private Map<Day, List<Exercise>> twoDayProgramMap;
//
//
//    //chrono exRest;
//
//    // TODO Change List<List<Exercise>> to List<Exercises>
//    public TwoDayProgram(int restCompound, int restAccessories, int setsCompound, int setsAccessories, List<Day> days, List<List<Exercise>> exercises) {
//        super(); // TODO, do this in all class
//        this.restCompound = restCompound;
//        this.restAccessories = restAccessories;
//        this.setsCompound = setsCompound;
//        this.setsAccessories = setsAccessories;
//        for (int i = 0; i < days.size(); i++) {
//            System.out.println(days.get(i));
//            System.out.println(exercises.get(i));
//            twoDayProgramMap.put(days.get(i), exercises.get(i));
//        }
//    }
//
//    public int getRestCompound() { // TODO add getters and setters in all classes
//        return restCompound;
//    }
//
//    public void setRestCompound(int restCompound) {
//        this.restCompound = restCompound;
//    }
//
//    public int getRestAccessories() {
//        return restAccessories;
//    }
//
//    public void setRestAccessories(int restAccessories) {
//        this.restAccessories = restAccessories;
//    }
//
//    public int getSetsCompound() {
//        return setsCompound;
//    }
//
//    public void setSetsCompound(int setsCompound) {
//        this.setsCompound = setsCompound;
//    }
//
//    public int getSetsAccessories() {
//        return setsAccessories;
//    }
//
//    public void setSetsAccessories(int setsAccessories) {
//        this.setsAccessories = setsAccessories;
//    }
//
//    public Map<Day, List<Exercise>> getTwoDayProgramMap() {
//        return twoDayProgramMap;
//    }
//
//    public void setTwoDayProgramMap(Map<Day, List<Exercise>> twoDayProgramMap) {
//        this.twoDayProgramMap = twoDayProgramMap;
//    }
//
//    public void addExercise(Day day, Exercise exercise) {
//        // Updates the chosen day with exercise (relies on HashMap and calls .equals() indirectly)
//        // Checks if day is in map
//        if (twoDayProgramMap.containsKey(day)) {
//            List<Exercise> exercises = twoDayProgramMap.get(day);
//            // Add exercise to existing exercises
//            exercises.add(exercise);
//            // Update value in map
//            twoDayProgramMap.put(day, exercises);
//        }
//    }
//
//    public void removeExercise(Day day, Exercise exercise) {
//        // Updates the chosen day with exercise
//        // Checks if day is in map
//        if (twoDayProgramMap.containsKey(day)) {
//            List<Exercise> exercises = twoDayProgramMap.get(day);
//            // Add exercise to existing exercises
//            exercises.remove(exercise);
//            // Update value in map
//            twoDayProgramMap.put(day, exercises);
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TwoDayProgram that = (TwoDayProgram) o;
//        return restCompound == that.restCompound &&
//                restAccessories == that.restAccessories &&
//                setsCompound == that.setsCompound &&
//                setsAccessories == that.setsAccessories;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(restCompound, restAccessories, setsCompound, setsAccessories);
//    }
//
//    @Override
//    //Double-Leg Knee Extensions
//    public void exD1(int weight) { // TODO rename all i to weight, use control G
//        System.out.println("Double-Leg Knee Extensions x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//        Timer.create(restAccessories).countDown();
//    }
//        Interactions.followingStatementEx(9);
//}
//
//    @Override
//    //Leg Press
//    public void exD2(int weight) {
//        System.out.println("Leg Press (Explosive Tempo) x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Overhead Dumbbell Tricep Extensions
//    public void exD3(int weight) {
//        System.out.println("Overhead Dumbbell Tricep Extensions x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Cable Tricep Extensions
//    public void exD4(int weight) {
//        System.out.println("Cable Tricep Extensions x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Leg Raises
//    public void exD5(int weight) {
//        System.out.println("Leg Raises x12 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Lateral Raise Machine
//    public void exD6(int weight) {
//        System.out.println("Lateral Raise Machine x12 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Dumbbell Lateral Raises
//    public void exD7(int weight) {
//        System.out.println("Dumbbell Lateral Raises x15 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    // Barbell Rows
//    public void exD8(int weight) {
//        System.out.println("Barbell Rows x8 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    // Lateral Raises
//    public void exD9(int weight) {
//        System.out.println("Lateral Raises x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    // Goblet Bulgarian Slip Squats
//    public void exD10(int weight) {
//        System.out.println("Goblet Bulgarian Slip Squats  x12 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//}
//
