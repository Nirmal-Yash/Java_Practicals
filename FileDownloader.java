import java.io.*;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileDownloader implements Runnable {
    private String fileUrl;
    private String destinationPath;

    public FileDownloader(String fileUrl, String destinationPath) {
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(fileUrl);
            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileOutputStream.close();
            inputStream.close();

            System.out.println("Download complete: " + destinationPath);
        } catch (IOException e) {
            System.out.println("Error downloading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileUrl = "https://0.zxc45.workers.dev/7c7350f4c39bf041ce9d1d67bb61e7a8/workerbot.org/Prison.Break.S01.1080p.BluRay.10Bit.English.Esubs.MoviesMod.org.zip";
        String destinationPath = "\";

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new FileDownloader(fileUrl, destinationPath));

        executorService.shutdown();
    }
}
