package TestProgram;

// FileNotFoundException
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}
