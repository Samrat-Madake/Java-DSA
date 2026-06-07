// 1. Print triangle pattern
/*

* 
* * 
* * *  
* * * * 



*/
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        // int a = 1;
        System.out.println("Enter the line number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a, 1, 0);
        sc.close();
    }

    public static void pattern(int line, int curr, int count) {
        // base
        if (curr >= (line + 1))
            return;

        // recursion
        System.out.print("* ");
        count++;

        if (count == curr) { // next line
            System.out.println();
            pattern(line, curr + 1, 0);
        }
        else pattern(line, curr, count);
    }
}
