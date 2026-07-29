package Multi_threading_and_Executor_service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class TestingFactorial {
    public static void main(String[] args) {
        List<Future<Integer>> list = new ArrayList<>();
       try (ExecutorService service = Executors.newFixedThreadPool(10)) {
           for (int i = 0; i < 10; i++) {
               FactorialCalculator task = new FactorialCalculator(i);
               list.add(service.submit(task));
           }
           for (Future<Integer> future : list) {
               System.out.printf("\n Result is: %d", future.get());
           }
           if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
               System.out.println("\n BOHOAT HUA BAS.....");
               service.shutdownNow();
           }
       }catch (InterruptedException | ExecutionException e){
           throw new RuntimeException(e);

       }
    }
}
