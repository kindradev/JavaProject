import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {
    public static void main(String[] args) {
        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service with a thread pool of size 2 ....");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        System.out.println("Creating Runnable ....");
        Runnable task1 = () -> {
            System.out.println("Executing task 1 at : " + System.nanoTime());

        };
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();


    }
}
