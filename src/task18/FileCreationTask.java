package task18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

class FileCreationTask implements Callable<List<String>> {
    private final int taskId;

    FileCreationTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public List<String> call() throws Exception {
        List<String> fileNames = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String fileName = "file_ " + taskId + "_" + i + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get(fileName).toFile()))) {
                for (int j = 0; j < 10; j++) {
                    writer.write("Random string " + random.nextInt(100));
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileNames.add(fileName);
            System.out.println(Thread.currentThread().getName() + " created: " + fileName);

            // Sleep for a random time between 1 and 3 seconds
            Thread.sleep((random.nextInt(3) + 1) * 1000);
        }

        return fileNames;
    }
}
