package ui;

import LogEntry.LogEntry;

public class Main {

    public Main(){
        String operation = "";
        LogEntry opEntry;
        while (true){
            opEntry = new LogEntry();
            Sytem.out.println("Please select an option: " +
                    "[1] New workout" +
                    "[2] Repeat previous workout" +
                    "[3] I am done for today, I quit!");
            operation = scanner.nexLine();
            System.out.println("You have selected: "+operation);
            int result = 0;
            if (operation.equals("1")) {
                opEntry.setOperation(operation);
                result = newWorkout(opEntry);
                opEntry.setResult(result);
            }
//            else if (operation.equals("2")) {
//                opEntry.setOperation(operation);
//                result = repeat(opEntry);
//                opEntry.setResult(result);
//            }

            else if (operation.equals("3")) {
                break;
            }

            Sytem.out.println("You have done: "+operationLog);
            }

        }
    }


    private int newWorkout(LogEntry logEntry) {
        System.out.println("Number of sets for this workout:");
        int setsAmount = scanner.nextInt();
        System.out.println("Number of seconds of rest between each set: ");
        int restTime = scanner.nextInt();
        scanner.nextLine(); //clears the line,
        // otherwise the carriage return is taken as the next input
        // and you get a blank "selected" loop
        return numberofSets(setsAmount);
    }

//    private int repeat(LogEntry opEntry) {
//        System.out.println("Number of sets for this workout:");
//        int setsAmount = scanner.nextInt();
//        System.out.println("Number of seconds of rest between each set: ");
//        int restTime = scanner.nextInt();
//        scanner.nextLine(); //clears the line,
//        // otherwise the carriage return is taken as the next input
//        // and you get a blank "selected" loop
//        return numberofSets(setsAmount);
//    }


    public static void numberofSets() {
        System.out.println("Good work! You did"+setsAmount+"sets so far.");
    }

    public static void remainingRestTime() {
        System.out.println("Rest! You have ... seconds left.");
    }

    public static void main(String[] args) {
        new Main();
    }
}





