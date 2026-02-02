/*Question 2:

Delete N Nodes After M Nodes of a Linked List
We have a linked list and two integers M and N.

 Traverse the linked list such that you retain M nodes then delete next N nodes, 
 continue the same till end of the linked list. 
 
 Difficulty Level: Rookie.

Sample Input 1: M = 2 N = 2 LL: 1->2->3->4->5->6->7->8
Sample Output 1: 1->2->5->6

Sample Input 2: M = 3 N = 2 LL: 1->2->3->4->5->6->7->8->9->10
Sample Output 2: 1->2->3->6->7->8 
*/

public class Q2_LL {

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

    public void Delete_M_N_node(int m, int n) {
        Node temp = head;

        while (temp != null) {

            for (int i = 1; i <=m; i++) {
                temp = temp.next;
                
            }
            if (temp == null) {
                return;
            }

            Node prev = temp;
            for (int i = 1; i <= n; i++) {
                if (prev.next == null) {
                    return;
                }
                prev.next = prev.next.next;

            }

        }
    }

    public static void main(String[] args) {

        Q2_LL ll = new Q2_LL();
        ll.addFirst(14);
        ll.addFirst(13);
        ll.addFirst(12);
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

        ll.Delete_M_N_node(2, 2);

        ll.print();

    }
}
