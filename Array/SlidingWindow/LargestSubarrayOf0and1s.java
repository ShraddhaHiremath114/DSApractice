import java.util.HashMap;

public class LargestSubarrayOf0and1s {
    public static int zone(int[] arr,int n){
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(sum,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,1};
        int n=arr.length;
        System.out.print(zone(arr,n));
    }
}
