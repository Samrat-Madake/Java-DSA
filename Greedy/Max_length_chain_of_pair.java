import java.util.*;

public class Max_length_chain_of_pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the no of pairs ");
        n = sc.nextInt();
        int n1[] = new int[n];
        int n2[] = new int[n];

        System.out.println("Enter the  pairs ");
        for (int i = 0; i < n2.length; i++) {
            n1[i] = sc.nextInt();
            n2[i] = sc.nextInt();
        }

        int arr[][] = new int[n1.length][3];
        for (int i = 0; i < arr.length; i++) {

            arr[i][0] = i;
            arr[i][1] = n1[i];
            arr[i][2] = n2[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        System.out.println("\n Affter Sort ");

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        int maxacc = 1;
        int lastend = arr[0][2];
        System.out.print("A" + 0 + "  ");

        for (int i = 1; i < n2.length; i++) {
            if (arr[i][1] > lastend) {
                maxacc++;
                lastend = arr[i][2];
                System.out.print("A" + arr[i][0] + "  ");
            }
        }
        System.out.print("Total Activity = " + maxacc);
        sc.close();

    }
    

}
