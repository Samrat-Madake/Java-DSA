// 1. Print numbers from 1 to N
import java.util.Scanner;
public class Q_1 {

    public static void main(String[] args) {
        System.out.println("Hello Guys");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        printNumbers(n);

    }

    public static void printNumbers(int n){
        if (n==0)return ;
        printNumbers(n-1);
        System.out.println(n);
    }
}