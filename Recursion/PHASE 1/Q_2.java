// 2. Print numbers from N to 1
import java.util.Scanner;
public class Q_2 {

    public static void main(String[] args) {
        System.out.println("Hello Guys");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        printNumbers(n);
        sc.close();

    }

    public static void printNumbers(int n){
        if (n==0)return ;
        System.out.println(n);
        printNumbers(n-1);
    }
}