// 3. Sum of first N natural numbers
import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();

        int ans = sumOfNumbers(n);
        System.out.println(ans);
        sc.close();

    }

    public static int sumOfNumbers(int n) {
        if (n == 0)
            return 0;
        return sumOfNumbers(n - 1) + n;
    }
}
