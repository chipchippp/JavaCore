package MemoryAndHandleException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatch {
    public static void main(String[] args) {
        // Với try-catch
        FileReader reader = null;
        try {
            reader = new FileReader("src/MemoryAndHandleException/file.txt");
            // Xử lý file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Với try-with-resources
        try (FileReader readerWithResources = new FileReader("src/MemoryAndHandleException/file.txt");
             BufferedReader bufferedReader = new BufferedReader(readerWithResources)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}