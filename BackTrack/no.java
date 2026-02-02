import java.util.*;

public class no {
      
    public static void combination(String numString[], int n ) {
      // Base


      //kaam

        
    }



    public static void main(String[] args) {
                   // 0  1   2      3    4     5     6      7     8     9
        String numString[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        System.out.println("Enter 2 digit no: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        String x =String.valueOf(n);
        System.out.println(x);
        // System.out.println(x.charAt(0));


      String str1= numString[x.charAt(0)];
        System.out.println(str1);

        // String str2= numString[x.charAt(1)];
        // System.out.println(str2);

        combination(numString, n);


        
    }
    
}
