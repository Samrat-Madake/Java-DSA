// Q 9 Reverse a number
import java.util.Scanner;

public class Q_9 {

    public static void main(String[] args) {
        System.out.println("Hallooooo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        String num = String.valueOf(n);
        // System.out.println("len :"+num.length());

        revNum(num, "");
        sc.close();
    }

    public static void revNum(String num, String ans) {
        if (num.length()== 0) {
            System.out.print("rev  : " + ans);
            return;
        }
        int n = num.length();
        revNum(num.substring(0, n - 1), ans + num.charAt(n - 1));
    }
}