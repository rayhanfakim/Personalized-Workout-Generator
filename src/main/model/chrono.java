package main.model;

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chrono {

    Scanner sc = new Scanner(System.in);


    public chrono(int restTime)  {
        System.out.println("[1] Start");
        System.out.println("[2] Pause");
        System.out.println("[3] Stop");
        int operation = sc.nextInt();

        while (true) {
            if (operation==1) {
                try {
                    countDown c = new countDown(restTime);
                } catch (InterruptedException e) { }
            }


            if (operation==2) {
                try {
                    countDown c = new countDown(0);
                } catch (InterruptedException e) { }
            }

            else if (operation==3) {
                System.out.println("I am done for this exercise! ");
                return; }
            }
        }

    }

    class countDown {
        public countDown(int x) throws InterruptedException {
            System.out.println("Number of seconds lefts:");
            for (int i = 0; i <= x; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(x - i);
        }
    }
}
