package ir.porteqali.javatutorial.P10_OOP;

public interface E052_DownloadListener {
    void downloadCompleted(int fileLength , String filePath);
    void downloadFailed();
}
