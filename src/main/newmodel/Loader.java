package main.newmodel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static List<String> load(Path file) {
        List<String> text = new ArrayList<>();
        if (Files.exists(file)) {
            try {
                text = Files.readAllLines(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
