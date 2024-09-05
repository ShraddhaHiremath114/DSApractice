import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,4,4,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i], freq+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        // System.out.println(map);

        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            System.out.println(key.getKey()+"->"+key.getValue());
        }
        for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }
        

    }
}
