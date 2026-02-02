import java.util.ArrayList;
import java.util.Collections;

public class sorting {

    public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
        System.out.println("hOlla amigo");

      list.add(6);
      list.add(20);
      list.add(3);
      list.add(2);
      list.add(15);

      System.out.println(list);
      
      Collections.sort(list);   // Ascending
      System.out.println(list);
      
      Collections.sort(list,Collections.reverseOrder());   //Descending
      System.out.println(list);

       
        
    }


    
}
