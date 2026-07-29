package Multi_threading_and_Executor_service;

public class PrintTask implements Runnable {
     private final char symbol;
     public PrintTask(char symbol) {
         this.symbol = symbol;
     }
     @Override
     public void run() {
         for (int i = 0; i < 10; i++) {
             System.out.println(this.symbol);
         }
     }
}
