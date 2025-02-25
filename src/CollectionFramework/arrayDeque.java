package CollectionFramework;
import java.util.ArrayDeque;

public class arrayDeque {   //this is a queue where values can be removed and add from both front and back and it can peek the values from both the side
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);   //element inserted first
        adq.offerLast(45);    //element inserted last
        adq.offer(26);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() : "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("poll() : "+adq);

        System.out.println(adq.pollLast());
        System.out.println("poll() : "+adq);

    }
}
