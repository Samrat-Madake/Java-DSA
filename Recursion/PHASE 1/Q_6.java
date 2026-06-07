// 6. Fibonacci Number
import java.util.Scanner;
class Q_6 {
    public static void main(String[] args) {
        System.out.println("Hallooooo");
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        fib(0,1,n);
        sc.close();
    }
    public static void fib(int n1, int n2, int x){
        if(x==1){
            System.out.print(n2);
            return;
        }
        fib(n2,n1+n2,x-1);
    }
} 
    

