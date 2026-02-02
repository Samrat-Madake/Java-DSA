import java.util.*;

public class Interleave_2_queue {

    public void Interleave_queue(Queue<Integer> q1, int n) {
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < n / 2; i++) {
            q2.add(q1.remove());
        }

        for (int i = 0; i < n / 2; i++) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        System.out.println(q1);

    }

    public static void main(String[] args) {

        Interleave_2_queue ob = new Interleave_2_queue();
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q1.add(i);
        }
        ob.Interleave_queue(q1, 10);

    }

}