package CollectionFramework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   //Comparator.reverseOrder() it will run Comparator in reverse format that will convert from nim-heap to max heap which means it will prioritize max value
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);    //Min-heap tree implementation
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());



    }
}
