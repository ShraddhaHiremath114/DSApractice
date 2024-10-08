import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr={-1,2,-1,3,2};//3
        HashMap<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
