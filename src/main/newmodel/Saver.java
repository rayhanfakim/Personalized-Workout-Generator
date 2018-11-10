package main.newmodel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Saver {

    public static void save(String text, Path file) {
        try {
            if (Files.exists(file)) {
                Files.write(file, Arrays.asList(text.split("\n")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
