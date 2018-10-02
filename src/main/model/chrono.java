package main.model;

import java.util.*;
import java.util.Scanner;

public class chrono {


    Scanner sc = new Scanner(System.in);


    public chrono(int restTime) {
        System.out.println("[1] Start");
        System.out.println("[2] Pause");
        System.out.println("[3] Stop");
        int operation = sc.nextInt();

        while (true) {
            if (operation==1) {
                countDown c = new countDown(restTime);

                }


//            if else (operation.equals("2")) {
////                countDown();
////            }
            else if (operation==3) {
                break;
            }

            }
        }

    }

    class countDown {
        public countDown(int x)
        {
            System.out.println("Number of seconds lefts:");
            for (int i = 0; i <= x; i++) {
                System.out.println(x - i);
                System.out.println(i);
        }
    }
}
