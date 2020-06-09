import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service ....");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating Runnable ....");
        Runnable runnable = () -> {
            System.out.println("Inside Runnable: " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task by the runnable to the executorService ....");
        executorService.submit(runnable);

        System.out.println("Shutting down the executor....");
        executorService.shutdown();

    }
}
