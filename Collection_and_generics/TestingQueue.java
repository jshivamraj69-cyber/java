package Collection_and_generics;

import javax.swing.text.Utilities;
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        for (Integer i : queue){
            System.out.printf("%d ",i);
            System.out.println(queue.peek());
            System.out.println(queue.element());

            }

        }
    }


