import java.util.*;

public class reverse_string {

    public static void main(String[] args) {
      
        Stack<Character> s =new Stack<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String : ");
        String x =sc.nextLine();

       
        

        for (int i = 0; i < x.length(); i++) {
            char curr=x.charAt(i);
            s.push(curr); 
        }

        
        for (int i = 0; i < x.length(); i++) {
            System.out.print( s.pop()); 
        }
    }
    
}
