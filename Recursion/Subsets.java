import java.util.List;
import java.util.ArrayList;
public class Subsets {
    public static void fun1(ArrayList output,int[] arr,int ind){
        if(ind==arr.length){
            for(int i=0;i<output.size();i++){
                System.out.print(output.get(i)+" ");
            }
            System.out.println();
            return;
        }

        //take
        output.add(arr[ind]);
        fun1(output, arr, ind+1);
        //backtrack
        output.remove(output.size()-1);
        
        //not take
        fun1(output, arr, ind+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        fun1(new ArrayList<>(),arr,0);
    }
}
