package ir.porteqali.javatutorial.P10_OOP;

public class E052_Downloader {

    public void download(E052_DownloadListener downloadListener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    downloadListener.downloadCompleted(10 , "/home/ali/file.txt");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
