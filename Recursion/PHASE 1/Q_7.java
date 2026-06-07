// 7. Count digits in a number

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        System.out.println("Hallooooo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        countDigit(n, 0);
        sc.close();
    }

    public static void countDigit(int n, int digit) {
        if (n <= 0) {
            System.out.print(digit);
            return;
        }
        countDigit(n / 10, digit + 1);
    }
}
