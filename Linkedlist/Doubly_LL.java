public class Doubly_LL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }


    public void add_middle(int index, int data){
        Node newNode =new Node(data);
        size++;

        Node temp=head;
        for (int i = 1; i < index-1; i++) {
            temp=temp.next;
        }
        Node actual =temp.next;

        newNode.next=temp.next;
        temp.next=newNode;
        actual.prev=newNode;
        newNode.prev=temp;
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
        head.prev=null;
        size--;
        return value;
    }

    public void print_Reverse(){

        Node temp = tail;

        while (temp !=null) {
            System.out.print(temp.data+ " -->");
            temp=temp.prev;
            
        }
        System.out.print("null");
        System.out.println();
    }
                 

    public void print() {

        if (head == null) {
            System.out.println("Linked list is empty");
        }
        //Step 1: Create a temparary node
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args) {
        Doubly_LL Dll =new Doubly_LL();
        Dll.addFirst(5);
        Dll.addFirst(4);
        Dll.addFirst(3);
        Dll.addFirst(2);
        Dll.addFirst(1);
        Dll.print();

      //  Dll.remove_first();
      
      Dll.add_middle(2, 100);
      Dll.print();

      Dll.print_Reverse();
    }
}
