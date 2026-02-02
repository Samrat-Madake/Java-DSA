import java.util.ArrayList;

public class Multi_demensional_Array {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        
        mainlist.add(list);
        mainlist.add(list2);
        
        System.out.println(mainlist);
        
        
        
        for(int i =0; i<mainlist.size();i++)
        {
            ArrayList<Integer> curlist=mainlist.get(i);
            for(int j =0; j< curlist.size(); j++){
                System.out.print(curlist.get(j)+" ");
            }
            System.out.println();
            
        }

    }
}
