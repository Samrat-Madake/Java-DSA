// Q 5. Power(x, n)
import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        System.out.println("Hallooooo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter power");
        int x = sc.nextInt();

        int ans = power(n, n, x);
        System.out.println(n + " ^ " + x + " : " + ans);
        sc.close();
    }

    public static int power(int ori, int n, int x) {
        if (x == 1)
            return n;
        return power(ori, ori * n, --x);
    }
}