package main.model;

public class IIIDP extends Program {

    int restCompound    = 320;
    int restAccessories = 120;
    int setsCompound    =   5;
    int setsAccessories =   4;

    chrono exRest;


    @Override
    //LIGHT Bench Press
    public void exD1(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Light Bench Press x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Roman Chair Leg Raises
    public void exD2(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Roman Chair Leg Raises x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Weighted Hip Thrusts
    public void exD3(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Weighted Hip Thrusts x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Single-Leg Knee Extensions
    public void exD4(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Single-Leg Knee Extensions x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Dumbbell Lateral Raises
    public void exD5(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Dumbbell Lateral Raises x15 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //LIGHT Low Bar Back Squats
    public void exD6(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Light Low Bar Back Squats x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }


    @Override
    //Med. Ball Oblique Twists
    public void exD7(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Med. Ball Oblique Twists x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Plank - Start New Chrono for time Plank then Rest
    public void exD8(int i) {
//        while (setsAccessories!=0) {
//            for (int p = 0; p < setsAccessories; p++) {
//                setsAccessories = setsAccessories - p;
//                System.out.println("Reverse Curls x10 @"+i+"lbs");
//                exRest = new chrono(restAccessories);
//            }
//            System.out.println("Done!");
//        }
    }

    @Override
    //Side Plank - Start New Chrono for time Plank then Rest
    public void exD9(int i) {
//        while (setsAccessories!=0) {
//            for (int p = 0; p < setsAccessories; p++) {
//                setsAccessories = setsAccessories - p;
//                System.out.println("Reverse Curls x10 @"+i+"lbs");
//                exRest = new chrono(restAccessories);
//            }
//            System.out.println("Done!");
//        }
    }

    @Override
    //Seated Shoulder Press
    public void exD10(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Seated Shoulder x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    //Tricep Cable Pulldowns
    public void exEXTRA1(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Tricep Cable Pulldowns x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

}
