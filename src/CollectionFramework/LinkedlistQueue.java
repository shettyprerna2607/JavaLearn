package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();   //linkedlist implements queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(26);
        System.out.println(queue);

        System.out.println(queue.poll()); //removes or return the element

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
