import java.util.*;

public class Trapping_Rainwater {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int min,Trapped_water=0,sum=0;

        System.out.println("Enter size of Array :");
        int length=sc.nextInt();
        int arr[]= new int[length];
        System.out.println("Enter Elements  of Array :");
        for (int i = 0; i < length; i++) {
            arr[i]=sc.nextInt();
            
        }

        //int arr[] ={4,0,3,2,1,2,3,0,4};
       
        for (int i = 0; i < arr.length; i++) {
            int left_max=0;
            int right_max=0;
            if (i==0) {
                left_max=arr[0];  
            }
            else
            {
                for (int j = i-1; j >=0; j--) {
                    if (arr[j]>=left_max) {
                        left_max=arr[j];
                    }
                }
            }

            if (i==(length-1)) {
                right_max=arr[(length-1)];
            }
            else
            {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]>=right_max) {
                        right_max=arr[j];
                    }
                }
            }

             min =Math.min(left_max, right_max);
             Trapped_water=min-arr[i];
             if (Trapped_water<0) {
                Trapped_water=0;
                
             }
             

             sum = sum+Trapped_water;
        }


        System.out.println("Total = "+ sum);



        sc.close();
        
        
    }
    
}
