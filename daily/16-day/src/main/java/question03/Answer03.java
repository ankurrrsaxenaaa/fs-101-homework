package question03;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class Answer03 {
    public static void main(String[] args) {
        Consumer<String> fileWriter= Answer03::accept;
        fileWriter.accept("File Content");
    }

    private static void writeFile(String str){
        try {
            Files.write(Paths.get("Answer03.txt"),str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void accept(String str) {
        Answer03.writeFile(str);
    }
}

