import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {
    public static String read(String path) {
        var content = new StringBuilder();
        content.setLength(0);

        try (var br = Files.newBufferedReader(Paths.get(path))){
            String  line;
            while ((line = br.readLine()) != null){
                content.append(line);
            }
        }catch (IOException ie){
            System.out.println("Ne staa shefe");
        }
        return content.toString();
    }
}