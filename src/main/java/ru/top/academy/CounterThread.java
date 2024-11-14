package ru.top.academy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterThread {
    int numThreads = 2;
    Counter counter = new Counter();

    CounterThread() {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        executor.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();

        while (!executor.isTerminated()){
        }

        System.out.println(counter.getCount());
    }
}
