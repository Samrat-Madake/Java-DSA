public class Linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: new node link to head
        newNode.next = head;
        // Step 3: assiging head to new node
        head = newNode;
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;

        }

        // Step 1: Create a temporary and new node node
        Node temp = head;
        Node newNode = new Node(data);
        size++;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // Step 2: new node link to next node
        newNode.next = temp.next;

        // Step 3: temp(Previous node) link to new node
        temp.next = newNode;
    }

    public void addLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: new node link to head
        tail.next = newNode;
        // Step 3: assiging head to new node
        tail = newNode;
    }

    public int remove_first() {
        if (size == 0) {
            System.out.println("Linked List is Empty \"Nigga\" ");
            return -1;
        } else if (size == 1) {
            // Head ==tail
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int remove_Last() {
        if (size == 0) {
            System.out.println("Linked List is Empty \"Nigga\" ");
            return -1;
        } else if (size == 1) {
            // Head ==tail
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;

        }
        int value = head.data;

        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    public int search(int key) {
        if (size == 0) {
            System.out.println("Linked List is Empty!!  \"Nigga\" ");
            return -1;
        }
        Node temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int recursive_search(Node head, int key) {
        // Base Case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = recursive_search(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        //print();

    }

    public void delete_node_from_Last(int n) {
        if (n == size) { // Head node
            remove_first();
            return;
        }

        Node prev = head;
        for (int i = 1; i < size - n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

    }

    public static boolean loop_in_LL() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void delete_Cycle_in_LL() {
        Node slow = head;
        Node fast = head;
        boolean cheack = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cheack = true;
                break;
            }
        }

        if (cheack == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {

            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        prev.next = null;

    }

    public Node get_mid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Mid node i.e last mode of 1st part
    }

    public Node merge_sort(Node head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;

        }

        // get mid
        Node mid = get_mid(head);
        // merge

        Node right_head = mid.next;
        mid.next = null;

        Node new_left = merge_sort(head);
        Node new_right = merge_sort(right_head);

        return merge(new_left, new_right);
    }

    public Node merge(Node head1, Node head2) {
        Node merge_LL = new Node(-1); // Dummy node for starting merged LL
        Node temp = merge_LL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }

        // For left items in left/1st Part
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        // For left items in right/2nd Part
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }

        return merge_LL.next;

    }

   
    public  void Zig_zag_LL(Node head){
        //1. Find mid
        Node mid= get_mid(head);


        //2. Reverse second half 

        // Node prev=null;
        // Node curr=mid.next;
        // mid.next=null;
        // Node next;

        // while (curr!=null) {

        //     next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next; 
        // }
        Node rhead =reverse(mid.next);
         mid.next=null;
        Node lhead=head;
        //1. Zig Zag merge

        Node next_left;
        Node next_right;

        while (rhead!=null && lhead!=null) {

            next_left=lhead.next;
            lhead.next=rhead;
            next_right=rhead.next;
            rhead.next=next_left;

            //Update
            lhead=next_left;
            rhead=next_right;
            
        }




    }
    public void print() {

        if (head == null) {
            System.out.println("Linked list is empty");
        }
        // Step 1: Create a temparary node
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();
        // ll.print();

        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();

        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();

        // ll.addMiddle(2, 10);
        // ll.print();

        // ll.delete_node_from_Last(4);
        // ll.print();

        // ll.reverse();

        // System.out.println("Remove First");
        // ll.remove_first();
        // ll.print();
        // System.out.println("Remove Last");
        // ll.remove_Last();
        // ll.print();

        // System.err.println("Size = " + size);

        // int key = 10;
        // System.out.println("Key(" + key + ")" + "found at index = " +
        // ll.search(key));

        // System.out.println("Key(" + key + ")" + "found at index = " +
        // ll.recursive_search(head,key));

        // @#//Detect Cycle in loop//#@//
        /*
         * 1-->2-->-->3-->4--|
         * ^ |
         * |-------------|
         */
        /*
         * head = new Node(1);
         * Node temp = new Node(2);
         * head.next = temp;
         * head.next.next = new Node(3);
         * head.next.next.next = new Node(4);
         * head.next.next.next.next = temp;
         * System.out.println(loop_in_LL());
         * delete_Cycle_in_LL();
         * System.out.println(loop_in_LL());
         * ll.print();
         */

        // /* MERGE SORT IN LL */

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);

        // ll.print();
        // ll.head = ll.merge_sort(ll.head);
        // ll.print();


        // /* Zig Zag on LL  */
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
       ll.Zig_zag_LL(head);
        ll.print();

    }

}