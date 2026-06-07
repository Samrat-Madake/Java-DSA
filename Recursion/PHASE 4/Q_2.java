
// 1. Print triangle pattern
/*

* 
* * 
* * *  
* * * * 



*/
import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        // int a = 1;
        System.out.println("Enter the line number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a, a, a);
        sc.close();
    }

    public static void pattern(int line, int curr, int count) {
        // base
        if (curr == 0)
            return;

        // recursion
        System.out.print("* ");
        count--;

        if (count == 0) { // next line
            System.out.println();
            pattern(line, curr - 1, curr - 1);
        } else
            pattern(line, curr, count);
    }
}
