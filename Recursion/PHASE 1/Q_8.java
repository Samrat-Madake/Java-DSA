// 8. Sum of digits
import java.util.Scanner;
class Q_8 {
    public static void main(String[] args) {
        System.out.println("Hallooooo");
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        countDigit(n,0);
        sc.close();
    }
    public static void countDigit(int n, int sum){
        if(n<=0){
            System.out.print(sum);
            return;
        }
        countDigit(n/10,sum+n%10);
    }
}