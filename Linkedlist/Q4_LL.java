public class Q4_LL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        // size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: new node link to head
        newNode.next = head;
        // Step 3: assiging head to new node
        head = newNode;
    }

    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public Node Swap_nodes(Node even, Node odd) {

        Node temp1 = head;
        int x = 0;
        int y = 0;
        while (temp1.next != even) {
            temp1 = temp1.next;
            x++;

        }
        Node temp2 = head;
        while (temp2.next != odd) {
            temp2 = temp2.next;
            y++;

        }
        x = x - 1;
        y = y - 1;

        Node prev1 = head;
        for (int i = 1; i < x; i++) {
            prev1 = prev1.next;
        }
        Node X = prev1.next;

        Node prev2 = head;

        for (int i = 1; i < y; i++) {
            prev2 = prev2.next;
        }
        Node Y = prev2.next;
        Node Y_next = Y.next;

        prev1.next = Y;
        Y.next = X.next;

        prev2.next = X;
        X.next = Y_next;

        Node retur = X.next;
        return retur;

    }

    public void even_odd_LL() {
        Node temp = head.next;

        while (temp != null) {

            if (temp.data % 2 == 0) {
                temp = temp.next;
            }
            Node X = temp;
            temp = temp.next;

            while (temp != null) {
                if (temp.data % 2 == 0) {
                    temp = Swap_nodes(X, temp);
                    break;
                }
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Q4_LL ll = new Q4_LL();

        ll.addFirst(11);
        ll.addFirst(10);

        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);

        ll.addFirst(6);
        ll.addFirst(5);

        ll.addFirst(4);
        ll.addFirst(3);

        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.even_odd_LL();
        //ll.Swap_nodes(4, 8);

        ll.print();

    }

}
