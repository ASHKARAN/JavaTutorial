package ir.porteqali.javatutorial.P09_FilesAndThreads;

import java.io.File;

public class E036_Files {

    public E036_Files() {
        File file = new File(
                "/home/ali/Videos/Java Tutorial videos/09-FilesAndThreads/E035_Threads1.mp4");

        System.out.println(file.exists());
    }
}
