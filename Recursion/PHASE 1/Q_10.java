// Q 10  palindrome number
import java.util.Scanner;
public class Q_10 {

        public static void main(String[] args) {
            System.out.println("Hallooooo");
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("Enter number");
            int n = sc.nextInt();
            
            String num = String.valueOf(n);
            // System.out.println("len :"+num.length());
            
            String ans = revNum(num,"", num.length());
            if(ans.equals(num))System.out.println("Its a Plaindrome");
            else System.out.println("Not a palindrome");
            sc.close();
        }
        public static String revNum(String num,String ans, int len){
            if(len==0){
                System.out.println("rev  : "+ ans);
                return ans;
            }
            int n = num.length();
           return  revNum(num.substring(0,n-1),ans + num.charAt(n-1), --len);
        }
    }
