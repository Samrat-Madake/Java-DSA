import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_end_not_sorted {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxacc = 0;

        int Activity[][] = new int[start.length][3];
        for (int i = 0; i < Activity.length; i++) {
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }

        //Sorting 2d Array
        Arrays.sort(Activity,Comparator.comparingDouble(o -> o[2]));

        for(int i=0;i<start.length;i++){
            for (int j = 0; j <3; j++) {
                System.err.print(Activity[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // 1st Activity select
        maxacc = 1;
        int lastend = Activity[0][2];
        System.out.print("A" + 0 + "  ");

        for (int i = 1; i < end.length; i++) {
            if (Activity[i][1] >= lastend) {
                maxacc++;
                lastend = Activity[i][2];
                System.out.print("A" + i + "  ");
            }
        }
        System.out.print("Total Activity = " + maxacc);

    }

}
