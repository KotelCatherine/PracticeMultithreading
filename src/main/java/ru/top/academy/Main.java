package ru.top.academy;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      /*  // Файл для чтения
        File inputFile = new File("input.txt");
        // Файл для записи
        File outputFile = new File("output.txt");
        // Количество потоков для обработки
        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                final String currentLine = line;
                executor.submit(() -> {
                    String processedLine = processLine(currentLine);
                    synchronized (writer) {
                        writer.println(processedLine);
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        // Завершаем работу пула потоков
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    // Метод для обработки строки

    private static String processLine(String line) {
        // Пример обработки строки - переворачиваем строку
        return new StringBuilder(line).reverse().toString();
    */
        new CounterThread();
    }
}
