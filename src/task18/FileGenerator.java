package task18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FileGenerator {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new FileCreationTask(i)));
        }
        executor.shutdown();
        for (Future<List<String>> future : futures) {
            try {
                List<String> fileNames = future.get();
                System.out.println("Created files: " + fileNames);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
