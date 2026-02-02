import java.util.Comparator;
import java.util.PriorityQueue;

public class Using_Objects {

    static class Student implements Comparable<Student> {
        int rank;
        String name;

        Student(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

      public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student(10, "AN"));
        pq.add(new Student(1, "GS"));
        pq.add(new Student(3, "SD"));
        pq.add(new Student(9, "VD"));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "  " + pq.peek().rank);
            pq.remove();

        }

    }

} 
