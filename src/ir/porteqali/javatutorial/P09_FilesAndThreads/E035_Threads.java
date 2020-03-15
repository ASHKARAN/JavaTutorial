package ir.porteqali.javatutorial.P09_FilesAndThreads;

public class E035_Threads {



    public E035_Threads() {
        MainThread();
        DownloadThread();
    }

    public void MainThread() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("Main thread is running");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    public void DownloadThread() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                while(true) {
                    System.out.println("Download thread is running");
                    counter ++;
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(counter>10)break;
                }
                System.out.println("Download task finished");


            }
        }).start();

    }
}
