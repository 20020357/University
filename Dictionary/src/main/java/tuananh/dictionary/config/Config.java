package tuananh.dictionary.config;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Config {
    private String url = "src/main/java/tuananh/dictionary/resources/data.txt";
    private File file;
    public FileReader fileReader;

    public Config() {
        file = new File(url);
    }

    public void connect() {
        if (file.length() == 0) {
            System.out.println("Connect Failure!!!");

            url = null;
            file = new File(url);
        } else {
            System.out.println("Connect Successfully!!!");
        }

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
