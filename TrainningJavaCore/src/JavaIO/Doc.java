package JavaIO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Doc {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("Input.txt"),StandardCharsets.UTF_8);
        for (String l : list){
            System.out.println(l);
        }
    }
}
