import java.util.HashMap;

public class SubArrayWithSum0 {
    public static boolean sub0(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,-1);

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum))return true;
            map.put(sum,i);
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={4,2,-3,1,6};
        int n=arr.length;
        System.out.println(sub0(arr,n));
    }
}
