import java.util.HashMap;
import java.util.Map;

public class FreqElement{
    public static void main(String[] args) {
        int[] arr={2,1,2,3,4,4,3,4,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        
        
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            System.out.println(key.getKey()+"->"+key.getValue());
        }
    }
}