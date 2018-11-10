//package main.model;
//
//import main.newmodel.Timer;
//import main.newui.Interactions;
//
//import java.util.List;
//
//public class ThreeDayProgram extends Program {
//
//    private int restCompound   ;
//    private int restAccessories;
//    private int setsCompound   ;
//    private int setsAccessories;
//
////    private Map<Day, List<Exercise>> threeDayProgramMap;
//
//
//    public ThreeDayProgram(int restCompound, int restAccessories, int setsCompound, int setsAccessories, List<Day> days, List<List<Exercise>> exercises) {
//        super();
//        this.restCompound = restCompound;
//        this.restAccessories = restAccessories;
//        this.setsCompound = setsCompound;
//        this.setsAccessories = setsAccessories;
////        for (int i = 0; i < days.size(); i++) {
////            System.out.println(days.get(i));
////            System.out.println(exercises.get(i));
////            threeDayProgramMap.put(days.get(i), exercises.get(i));
////        }
//    }
//
//    public int getRestCompound() {
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
////    public void setTwoDayProgramMap(Map<Day, List<Exercise>> twoDayProgramMap) {
////        this.threeDayProgramMap = threeDayProgramMap;
////    }
////
////    public void addExercise(Day day, Exercise exercise) {
////        // Updates the chosen day with exercise (relies on HashMap and calls .equals() indirectly)
////        // Checks if day is in map
////        if (threeDayProgramMap.containsKey(day)) {
////            List<Exercise> exercises = threeDayProgramMap.get(day);
////            // Add exercise to existing exercises
////            exercises.add(exercise);
////            // Update value in map
////            threeDayProgramMap.put(day, exercises);
////        }
////    }
////
////    public void removeExercise(Day day, Exercise exercise) {
////        // Updates the chosen day with exercise
////        // Checks if day is in map
////        if (threeDayProgramMap.containsKey(day)) {
////            List<Exercise> exercises = threeDayProgramMap.get(day);
////            // Add exercise to existing exercises
////            exercises.remove(exercise);
////            // Update value in map
////            threeDayProgramMap.put(day, exercises);
////        }
////    }
////
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        TwoDayProgram that = (TwoDayProgram) o;
////        return restCompound == that.restCompound &&
////                restAccessories == that.restAccessories &&
////                setsCompound == that.setsCompound &&
////                setsAccessories == that.setsAccessories;
////    }
////
////    @Override
////    public int hashCode() {
////
////        return Objects.hash(restCompound, restAccessories, setsCompound, setsAccessories);
////    }
//
//    @Override
//    //LIGHT Bench Press
//    public void exD1(int weight) {
//        System.out.println("Light Bench Press x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Roman Chair Leg Raises
//    public void exD2(int weight) {
//        System.out.println("Roman Chair Leg Raises x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Weighted Hip Thrusts
//    public void exD3(int weight) {
//        System.out.println("Weighted Hip Thrusts x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Single-Leg Knee Extensions
//    public void exD4(int weight) {
//        System.out.println("Single-Leg Knee Extensions x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Dumbbell Lateral Raises
//    public void exD5(int weight) {
//        System.out.println("Dumbbell Lateral Raises x15 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //LIGHT Low Bar Back Squats
//    public void exD6(int weight) {
//        System.out.println("Light Low Bar Back Squats x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//
//    @Override
//    //Med. Ball Oblique Twists
//    public void exD7(int weight) {
//        System.out.println("Med. Ball Oblique Twists x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Plank - Start New Chrono for time Plank then Rest ; TODO Different timer, exception
//    public void exD8(int weight) {
//        System.out.println("Reverse Curls x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Side Plank - Start New Chrono for time Plank then Rest ; TODO Different timer, exception
//    public void exD9(int weight) {
//        System.out.println("Reverse Curls x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    @Override
//    //Seated Shoulder Press
//    public void exD10(int weight) {
//        System.out.println("Seated Shoulder x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//    //Tricep Cable Pulldowns
//    public void exEXTRA1(int weight) {
//        System.out.println("Tricep Cable Pulldowns x10 @" + weight + "lbs");
//        for (int i = 0; i < setsAccessories; i++) {
//            Timer.create(restAccessories).countDown();
//        }
//        Interactions.followingStatementEx(9);
//    }
//
//}
