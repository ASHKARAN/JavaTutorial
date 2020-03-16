package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E037WriteFile {

    public E037WriteFile() {
        String data = " my name is ali ";

        /**
         * create a new file
         */
        File file = new File("/home/ali/tmp/java/file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * write data into file
         */
        try {
            FileWriter fileWriter = new FileWriter("/home/ali/tmp/java/file1.txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
