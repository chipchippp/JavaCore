package JavaReflectionApi_InputAndOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader("src/resource/input.txt"))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try (BufferedWriter writer = new BufferedWriter((new FileWriter("src/resource/input.txt")))) {
//            writer.write("Hello World");
//            writer.write("Ha ha ha");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Path path = Paths.get("src/resource/input.txt");
        Files.write(path, "Hello World".getBytes());
        System.out.println(Files.readAllBytes(path));
    }
}
