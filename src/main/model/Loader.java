package main.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Loader {
    public static List<String> loadUsers(Path file) {
        List<String> data = new ArrayList<>();

        if (Files.exists(file)) {
            try {
                for (String line : Files.readAllLines(file)) {
                    String name = line.split(", ")[0];
                    data.add(name);
                    String currentDay = line.split(", ")[1];
                    data.add(currentDay);
                    String maxDays = line.split(", ")[2];
                    data.add(maxDays);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

//    public static List<String> load(Path file) {
//        List<String> text = new ArrayList<>();
//        if (Files.exists(file)) {
//            try {
//                text = Files.readAllLines(file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return text;
//    }
}
