import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AllDupInArr {
    public static ArrayList<Integer> find(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1); 
        }
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            if(key.getValue()>1){
                ans.add(key.getKey());
            }
        }
        if(ans.size()==0)ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        int n=arr.length;
        System.out.println(find(arr,n));
    }
}
