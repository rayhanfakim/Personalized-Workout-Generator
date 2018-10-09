package main.model;

public abstract class IIDP implements workOutTemplate {

    int restCompound    = 240;
    int restAccessories = 120;
    int setsCompound    =   5;
    int setsAccessories =   4;

    chrono exRest;

    @Override
    //Low Bar Back Squats
    public void ex1(int i) {
        while (setsCompound!=0) {
            for (int p = 0; p < setsCompound; p++) {
                setsCompound = setsCompound - p;
                System.out.println("LBB Squats x5 @"+i+"lbs");
                exRest = new chrono(restCompound);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Reverse Curls
    public void ex2(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Reverse Curls x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }

    }

    @Override
    //Bench Press
    public void ex3(int i) {
        while (setsCompound!=0) {
            for (int p = 0; p < setsCompound; p++) {
                setsCompound = setsCompound - p;
                System.out.println("Bench Press x5 @"+i+"lbs");
                exRest = new chrono(restCompound);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Double-Leg Knee Extensions
    public void ex4(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Double-Leg Knee Extensions x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Leg Press
    public void ex5(int i) {
        while (setsAccessories!=0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Leg Press (Explosive Tempo) x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Overhead Dumbbell Tricep Extensions
    public void ex6(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Overhead Dumbbell Tricep Extensions x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Cable Tricep Extensions
    public void ex7(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Cable Tricep Extensions x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Leg Raises
    public void ex8(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Leg Raises x12 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Lateral Raise Machine
    public void ex9(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Lateral Raise Machine x12 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Deadlifts
    public void ex10(int i) {
        while (setsCompound!=0) {
            for (int p = 0; p < setsCompound; p++) {
                setsCompound = setsCompound - p;
                System.out.println("Deadlifts x5 @"+i+"lbs");
                exRest = new chrono(restCompound);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Dumbbell Lateral Raises
    public void ex11(int i) {
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
    //OHP
    public void ex12(int i) {
        while (setsCompound!=0) {
            for (int p = 0; p < setsCompound; p++) {
                setsCompound = setsCompound - p;
                System.out.println("OHP x5 @"+i+"lbs");
                exRest = new chrono(restCompound);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Pull Ups
    public void ex13(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Pull Ups x3 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Barbell Rows
    public void ex14(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Barbell Rows x8 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Lateral Raises
    public void ex15(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Lateral Raises x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Lat. Pulldowns
    public void ex16(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Lat. Pulldowns x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }

    }

    @Override
    //Barbell Bicep Curls
    public void ex17(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Barbell Bicep Curls x10 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Goblet Bulgarian Slip Squats
    public void ex18(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Goblet Bulgarian Slip Squats  x12 @"+i+"lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }
}
