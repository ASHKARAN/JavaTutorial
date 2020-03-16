package ir.porteqali.javatutorial.P10_OOP;

public class E052_Interface implements  E052_DownloadListener{

    public E052_Interface() {

        System.out.println("E052_Interface");
        download();
        System.out.println("i'm working");

    }

    private void download() {
        E052_Downloader downloader = new E052_Downloader();
        downloader.download(this);
    }

    @Override
    public void downloadCompleted(int fileLength, String filePath) {

        System.out.println("downloadCompleted   "  );
        System.out.println("fileLength : " + fileLength );
        System.out.println("filePath : " + filePath );
    }

    @Override
    public void downloadFailed() {

        System.out.println("downloadFailed");
    }
}
