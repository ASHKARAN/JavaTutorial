package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E038_ReadFile {

    public E038_ReadFile() {
        File file = new File("/home/ali/tmp/java/file1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
