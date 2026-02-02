
public class Activity_Selection {


    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxacc=0;

        //1st Activity select
        maxacc=1;
        int lastend=end[0];
        System.out.print("A"+0+"  ");

        for(int i =1; i<end.length;i++){
            if (start[i]>=lastend) {
                maxacc++;
                lastend=end[i];
                System.out.print("A"+i+"  ");
            }
        }
        System.out.print("Total Activity = "+ maxacc);
        
    }

    
}