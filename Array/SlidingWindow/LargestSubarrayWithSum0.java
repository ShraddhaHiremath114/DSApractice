import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public static int sub0(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(sum,-1);

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
                // return true;
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10,23};
        int n=arr.length;
        System.out.println(sub0(arr,n));
    }
}
