import java.util.HashMap;

public class LargestSubarraySumK {
    public static void main(String[] args) {
        int[] arr={-1,2,3};
        int k=6;

        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,-1);

        int ans=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans=Math.max(ans, i-map.get(sum-k));
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(ans);
    }
}
