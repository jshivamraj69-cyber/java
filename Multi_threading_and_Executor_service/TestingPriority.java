package Multi_threading_and_Executor_service;

public class TestingPriority {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%n%s Total time taken: %d ms%n",
                Thread.currentThread().getName(), (endTime - startTime));
    }
}