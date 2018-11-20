package main.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Saver {

    public static void saveUsers(List<User> users, Path file) {
        String text = "";
        for (User user : users) {
            text += user.getName() + ", " + user.getDay() + ", " + user.getProgram().getDays() + "\n";
        }
        try {
            if (Files.exists(file)) {
                Files.write(file, Arrays.asList(text.split("\n")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void save(String text, Path file) {
//        try {
//            if (Files.exists(file)) {
//                Files.write(file, Arrays.asList(text.split("\n")));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
