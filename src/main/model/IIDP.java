package main.model;

public class IIDP extends Program {

    int restCompound = 240;
    int restAccessories = 120;
    int setsCompound = 5;
    int setsAccessories = 4;

    chrono exRest;

    @Override
    //Double-Leg Knee Extensions
    public void exD1(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Double-Leg Knee Extensions x10 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Leg Press
    public void exD2(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Leg Press (Explosive Tempo) x10 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Overhead Dumbbell Tricep Extensions
    public void exD3(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Overhead Dumbbell Tricep Extensions x10 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Cable Tricep Extensions
    public void exD4(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Cable Tricep Extensions x10 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Leg Raises
    public void exD5(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Leg Raises x12 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Lateral Raise Machine
    public void exD6(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Lateral Raise Machine x12 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    //Dumbbell Lateral Raises
    public void exD7(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Dumbbell Lateral Raises x15 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Barbell Rows
    public void exD8(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Barbell Rows x8 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Lateral Raises
    public void exD9(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Lateral Raises x10 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

    @Override
    // Goblet Bulgarian Slip Squats
    public void exD10(int i) {
        while (setsAccessories != 0) {
            for (int p = 0; p < setsAccessories; p++) {
                setsAccessories = setsAccessories - p;
                System.out.println("Goblet Bulgarian Slip Squats  x12 @" + i + "lbs");
                exRest = new chrono(restAccessories);
            }
            System.out.println("Done!");
        }
    }

}

