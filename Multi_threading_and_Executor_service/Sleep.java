package Multi_threading_and_Executor_service;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println("RED");
            Thread.sleep(7000);
            System.out.println("YELLOW");
            Thread.sleep(5000);
            System.out.println("GREEN");
            Thread.sleep(10000);
        }
    }
}
