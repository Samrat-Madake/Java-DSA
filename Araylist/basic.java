import java.util.ArrayList;

public class basic {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("hOlla amigo");

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);

      System.out.println(list);
    //   list.add(0, 10);
    //   System.out.println(list);

    //    // Get 
    //   System.out.println(list.get(0));

    //   //Remove
    //   list.remove(0);
    //   System.out.println(list.remove(0));
    //   System.out.println(list);

    //   //Set (aka Replace)
    //   list.set(3, 100);
    //   System.out.println(list);


      //Contain Element (Return trur if elemt present at index)
      System.out.println(list.contains(2));



    }

}