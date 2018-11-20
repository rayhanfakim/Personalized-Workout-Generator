package main.ui;

import main.model.Day;
import main.model.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Setup {

    protected int restCompound    = 240;
    protected int restAccessories = 120;
    protected int setsCompound    = 5;
    protected int setsAccessories = 4;

    static List<Exercise> exercises = new ArrayList<>();

    static List<Exercise> dayOneTwoDayProgram = new ArrayList<>();
    static List<Exercise> dayTwoTwoDayProgram = new ArrayList<>();

    static List<Exercise> dayOneThreeDayProgram   = new ArrayList<>();
    static List<Exercise> dayTwoThreeDayProgram   = new ArrayList<>();
    static List<Exercise> dayThreeThreeDayProgram = new ArrayList<>();

    Day day1 = new Day(1);
    Day day2 = new Day(2);
    Day day3 = new Day(3);

    public static final Map<Day, List<Exercise> > twoDaysProgramExerciseMap   = new HashMap<>();
    public static final Map<Day, List<Exercise> > threeDaysProgramExerciseMap = new HashMap<>();

    //   public static Program twoDayProgram = new TwoDayProgram("Default Two Day Program", twoDaysProgramExerciseMap);
    // static Program threeDayProgram...

    public Setup() {

        // Common
        Exercise lowBarBackSquats = new Exercise("Low Back Bar Squats x5", 135, setsCompound, restCompound);
        Exercise reverseCurls = new Exercise("Reverse Curls x10", 40, setsAccessories, restAccessories);
        Exercise benchPress = new Exercise("Bench Press x5", 95, setsCompound, restCompound);
        Exercise deadLifts = new Exercise("Deadlifts x5", 155, setsCompound, restCompound);
        Exercise overHeadPress = new Exercise("OHP x5", 65, setsCompound, restCompound);
        Exercise pullUps = new Exercise(" Pull Ups x3", 0, setsAccessories, setsAccessories);
        Exercise pullDowns = new Exercise("Pull downs x10", 70, setsAccessories, restAccessories);
        Exercise barbellBicepCurls = new Exercise("Barbell Bicep Curls x10", 40, setsAccessories, restAccessories);

        // Only in two days program
        Exercise doubleLegKneeExtensions = new Exercise("Double-Leg Knee Extentions x10", 90, setsAccessories, restAccessories);
        Exercise legPress = new Exercise("Leg Press (Explosive Tempo) x10", 90, setsAccessories, restAccessories);
        Exercise overheadDumbbellTricepExtensions = new Exercise("Overhead Dumbbell Tricep Extensions x10", 25, setsAccessories, restAccessories);
        Exercise cableTricepExtensions = new Exercise("Cable Tricep Extensions x10", 70, setsAccessories, restAccessories);
        Exercise legRaises = new Exercise("Leg Raises x12", 90, setsAccessories, restAccessories);
        Exercise lateralRaiseMachine = new Exercise("Lateral Raise Machine x12", 50, setsAccessories, restAccessories);
        Exercise dumbbellLateralRaises = new Exercise("Dumbbell Lateral Raises x15", 10, setsAccessories, restAccessories);
        Exercise dumbbellRows = new Exercise("Dumbbell Rows x10", 25, setsAccessories, restAccessories);
        Exercise lateralRaises = new Exercise("Lateral Raises x10", 13, setsAccessories, restAccessories);
        Exercise gobletBulgarianSlipSquats = new Exercise("Goblet Bulgarian Slip Squats  x12", 35, setsAccessories, restAccessories);

        // Only in three days program
        Exercise lightBenchPress = new Exercise("Light Bench Press x10", 65, setsAccessories, restAccessories);
        Exercise romanChairLegRaises = new Exercise("Roman Chair Leg Raises x10", 0, setsAccessories, restAccessories);
        Exercise weightedHipThrusts = new Exercise("Weighted Hip Thrusts x10", 50, setsAccessories, restAccessories);
        Exercise singleLegKneeExtensions = new Exercise("Single-Leg Knee Extensions x10", 50, setsAccessories, restAccessories);
        Exercise lightLowBarBackSquats = new Exercise("Light Low Bar Back Squats x10", 80, setsAccessories, restAccessories);
        Exercise medBallObliqueTwists = new Exercise("Med. Ball Oblique Twists x10", 16, setsAccessories, restAccessories);
        Exercise seatedShoulderPress = new Exercise("Seated Shoulder Press x10", 50, setsAccessories, restAccessories);
        Exercise tricepCablePullDowns = new Exercise("Tricep Cable Pulldowns x10", 60, setsAccessories, restAccessories);

        exercises.add(lowBarBackSquats);
        exercises.add(reverseCurls);
        exercises.add(benchPress);
        exercises.add(deadLifts);
        exercises.add(overHeadPress);
        exercises.add(pullUps);
        exercises.add(pullDowns);
        exercises.add(barbellBicepCurls);
        exercises.add(doubleLegKneeExtensions);
        exercises.add(legPress);
        exercises.add(overheadDumbbellTricepExtensions);
        exercises.add(cableTricepExtensions);
        exercises.add(legRaises);
        exercises.add(lateralRaiseMachine);
        exercises.add(dumbbellLateralRaises);
        exercises.add(dumbbellRows);
        exercises.add(lateralRaises);
        exercises.add(gobletBulgarianSlipSquats);
        exercises.add(lightBenchPress);
        exercises.add(romanChairLegRaises);
        exercises.add(weightedHipThrusts);
        exercises.add(singleLegKneeExtensions);
        exercises.add(lightLowBarBackSquats);
        exercises.add(medBallObliqueTwists);
        exercises.add(seatedShoulderPress);
        exercises.add(tricepCablePullDowns);


        dayOneTwoDayProgram.add(lowBarBackSquats);
        dayOneTwoDayProgram.add(reverseCurls);
        dayOneTwoDayProgram.add(benchPress);
        dayOneTwoDayProgram.add(doubleLegKneeExtensions);
        dayOneTwoDayProgram.add(legPress);
        dayOneTwoDayProgram.add(overheadDumbbellTricepExtensions);
        dayOneTwoDayProgram.add(cableTricepExtensions);
        dayOneTwoDayProgram.add(legRaises);
        dayOneTwoDayProgram.add(lateralRaiseMachine);

        dayTwoTwoDayProgram.add(deadLifts);
        dayTwoTwoDayProgram.add(dumbbellLateralRaises);
        dayTwoTwoDayProgram.add(overHeadPress);
        dayTwoTwoDayProgram.add(pullUps);
        dayTwoTwoDayProgram.add(dumbbellRows);
        dayTwoTwoDayProgram.add(lateralRaises);
        dayTwoTwoDayProgram.add(pullDowns);
        dayTwoTwoDayProgram.add(barbellBicepCurls);
        dayTwoTwoDayProgram.add(gobletBulgarianSlipSquats);


        dayOneThreeDayProgram.add(lowBarBackSquats);
        dayOneThreeDayProgram.add(pullUps);
        dayOneThreeDayProgram.add(lightBenchPress);
        dayOneThreeDayProgram.add(romanChairLegRaises);
        dayOneThreeDayProgram.add(weightedHipThrusts);
        dayOneThreeDayProgram.add(singleLegKneeExtensions);

        dayTwoThreeDayProgram.add(deadLifts);
        dayTwoThreeDayProgram.add(dumbbellLateralRaises);
        dayTwoThreeDayProgram.add(lightLowBarBackSquats);
        dayTwoThreeDayProgram.add(pullUps);
        dayTwoThreeDayProgram.add(pullDowns);
        dayTwoThreeDayProgram.add(medBallObliqueTwists);

        dayThreeThreeDayProgram.add(benchPress);
        dayThreeThreeDayProgram.add(reverseCurls);
        dayThreeThreeDayProgram.add(overHeadPress);
        dayThreeThreeDayProgram.add(barbellBicepCurls);
        dayThreeThreeDayProgram.add(seatedShoulderPress);
        dayThreeThreeDayProgram.add(tricepCablePullDowns);



        twoDaysProgramExerciseMap.put(day1, dayOneTwoDayProgram);
        twoDaysProgramExerciseMap.put(day2, dayTwoTwoDayProgram);

        threeDaysProgramExerciseMap.put(day1, dayOneThreeDayProgram);
        threeDaysProgramExerciseMap.put(day2, dayTwoThreeDayProgram);
        threeDaysProgramExerciseMap.put(day3, dayThreeThreeDayProgram);


    }

    public int getRestCompound() {
        return restCompound;
    }

    public void setRestCompound(int restCompound) {
        this.restCompound = restCompound;
    }

    public int getRestAccessories() {
        return restAccessories;
    }

    public void setRestAccessories(int restAccessories) {
        this.restAccessories = restAccessories;
    }

    public int getSetsCompound() {
        return setsCompound;
    }

    public void setSetsCompound(int setsCompound) {
        this.setsCompound = setsCompound;
    }

    public int getSetsAccessories() {
        return setsAccessories;
    }

    public void setSetsAccessories(int setsAccessories) {
        this.setsAccessories = setsAccessories;
    }
}
