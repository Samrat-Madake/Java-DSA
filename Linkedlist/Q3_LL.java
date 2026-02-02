/*Question 3:
Swapping Nodes in a Linked List

We have a linked list and two keys in it, 
swap nodes for two given keys. 
Nodes should be swapped by changing links. 

Swapping data of nodes may be expensive in many situations when data contains many fields.
 It may be assumed that all keys in the linked list are distinct.

Sample Input 1: 1->2->3->4, x = 2, y = 4
Sample Output 1: 1->4->3->2 
*/

public class Q3_LL {
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

    public void Swap_nodes(int x, int y) {
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

    }

    public static void main(String[] args) {

        Q3_LL ll = new Q3_LL();

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
        ll.Swap_nodes(4, 8);

        ll.print();

    }

}
