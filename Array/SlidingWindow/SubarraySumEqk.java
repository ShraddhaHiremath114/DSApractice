import java.util.HashMap;

public class SubarraySumEqk {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k=3;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,1);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
