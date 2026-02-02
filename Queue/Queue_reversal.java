import java.util.*;

public class Queue_reversal {

    public static void queue_reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for (int i = 0; i < n; i++) {
            s.push(q.remove());
        }
        for (int i = 0; i < n; i++) {
            q.add(s.pop());
        }

        System.out.println(q);
        
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        queue_reverse(q);

    }

}
