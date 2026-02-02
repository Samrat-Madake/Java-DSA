
import java.util.*;

public class Insert_in_Heap {

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void Insert(int elememt) {
            arr.add(elememt);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {

                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;

            }
        }

        public int remove() {

            int data = arr.get(0);

            // Step 1: Swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 : Delete Last node
            arr.remove(arr.size() - 1);

            // Step 3 : Heapify O(log n)

            heapify(0);
            return data;
        }

        private void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {

                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);

            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.Insert(10);
        hp.Insert(5);
        hp.Insert(2);
        hp.Insert(4);
        hp.Insert(3);
        hp.Insert(1);

        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }

        // System.out.println(hp.arr + " ");
    }

}