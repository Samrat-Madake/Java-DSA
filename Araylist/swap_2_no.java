import java.util.*;

public class swap_2_no {

    public static void swap(ArrayList<Integer> list, int n1, int n2)
    {
      
        int temp=list.get(n1);
        list.set(n1, list.get(n2));
        list.set(n2, temp);

        System.out.println(list);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("hOlla amigo");
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Enter 2 index between 0-4");
        int n1=sc.nextInt();
        int n2=sc.nextInt();


        System.out.println(list);
        swap(list, n1, n2);
       
    }
}
