import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample2 {
    public static void main(String[] args) {
        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service with a thread pool of size 2 ....");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Creating Runnable ....");
        Runnable task1 = () -> {
            System.out.println("Executing task 1 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException();
            }

        };

        Runnable task2 = () -> {
            System.out.println("Executing task 2 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException();
            }

        };

        Runnable task3 = () -> {
            System.out.println("Executing task 3 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                throw new IllegalStateException();
            }

        };
        System.out.println("Submit the task by the runnable to the executorService ....");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        System.out.println("Shutting down the executor....");
        executorService.shutdown();

    }
}
