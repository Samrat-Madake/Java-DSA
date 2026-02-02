import java.util.LinkedList;

public class LL_JCF {

    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(44);

        System.out.println(ll.get(0));
        System.out.println(ll);
        System.out.println(ll.isEmpty());
        
        
    }
    
}
