package ir.porteqali.javatutorial.P16_Java8;

import ir.porteqali.javatutorial.P10_OOP.E052_DownloadListener;

public class E085_Lambda {

    public E085_Lambda() {
        E052_DownloadListener downloadListener = new E052_DownloadListener() {
            @Override
            public void downloadCompleted(int fileLength, String filePath) {
                System.out.println(filePath);
            }
        };


        E052_DownloadListener lambdaDownloadListener =
                (fileLength, filePath) -> System.out.println(filePath);


        lambdaDownloadListener.downloadCompleted(1 , "path");

    }
}
