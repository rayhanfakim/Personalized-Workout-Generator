package main.model;

import java.util.concurrent.TimeUnit;

public class Timer {

    private int time;

    private Timer(int time) {
        this.time = time;
    }

    // Static Factory Method
    public static Timer create(int time) {
        return new Timer(time);
    }

    public void countDown() {
        System.out.println("Number of seconds lefts:");
        for (int i = 0; i <= time; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ignored) {
                // ignoring exception - It will never occur, because there is only one thread
            }
            System.out.println(time - i);
        }
    }


}