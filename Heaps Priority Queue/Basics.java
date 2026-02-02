import java.util.PriorityQueue;

public class Basics{


    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2);
        pq.add(5);
        pq.add(1);
        pq.add(10);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+ " ");
            pq.remove();
            
        }
    }
}