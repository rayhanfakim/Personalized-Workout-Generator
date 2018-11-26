package main.model;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Timer extends Observable {

    private int time;
    private int remaining;

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
                sleep(1000);
                remaining = time - i;
            } catch (InterruptedException ignored) {
                // ignoring exception - It will never occur, because there is only one thread
            }
            System.out.println(time - i); // TODO remove
            setChanged();
            notifyObservers(remaining);
        }
    }

    public int getRemaining() {
        return remaining;
    }

    public void setTime(int time) {
        this.time = time;
        setChanged();
        notifyObservers();
    }

}