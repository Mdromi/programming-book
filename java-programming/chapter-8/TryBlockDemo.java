
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TryBlockDemo {
    public static void main(String[] args) {
        String text = "Practice makes a man perfect";

        try {
            System.out.println("Entered on try block");

            Files.writeString(Path.of("file.txt"), text, StandardOpenOption.WRITE);
        } catch(IOException e) {
            System.out.println("Entered on catch block");
            e.printStackTrace();
        }
    }
}