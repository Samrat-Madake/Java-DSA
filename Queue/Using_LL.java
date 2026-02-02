public  class Using_LL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEMpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // ADD
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty NIGGA");
                return -1;
            }

            int front = head.data;
            if (head == tail) {
                head = tail = null;
            }
            head = head.next;

            return front;
        }

        // Peak
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty NIGGA");
                return -1;
            }
            return head.data;

        }
        
    }
    public static void main(String[] args) {

        Queue q =new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.peek());
        
    }


    
}