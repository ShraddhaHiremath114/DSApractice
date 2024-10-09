import java.util.ArrayList;
import java.util.List;

public class PowerSet{
    static int totalps=0;
    public static void fun(ArrayList output,int[] input,int index){
        //base case pe list ko print karo
        if(index==input.length){
            for(int i=0;i<output.size();i++){
                System.out.print(output.get(i)+" ");
            }
            System.out.println();
            totalps++;
            return;
        }
        
        //not take
        fun(output,input,index+1);

        //take
        output.add(input[index]);
        fun(output,input,index+1);
        output.remove(output.size()-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        fun(new ArrayList<>(),arr,0);
        // List<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // System.out.println(list);
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        System.out.print("Total nO of Power Set: "+totalps);
    }
}