public class Using_Array {

    public static class Queue {

        static int arr[];
        static int rear;
        static int size;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;

        }

        // Empty
        public boolean is_Empty() {
            return rear == -1;

        }

        // Add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove
        public int remove() {
            if (rear == -1) {
                System.out.println("Queue if Empty ");
            }
            int front = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            rear = rear - 1;
            return front;
        }

        // Peak
        public int peek() {
            if (is_Empty()) {
                System.out.println("Queue if Empty ");
            }
            return arr[0];

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Remove = " + q.remove());
        System.out.println("Remove = " + q.remove());
        System.out.println("Peek = " + q.peek());
        while (!q.is_Empty()) {
            System.out.print(q.remove() + " ");

        }

    }

}