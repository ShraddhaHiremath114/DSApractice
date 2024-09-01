import java.util.Arrays;
public class MinimizeHeight {
    public static void main(String[] args) {
        int[] arr={1,5,8,10};
        int k=2;
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];

        int mi,mx;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-k < 0)continue;
            mi=Math.min(arr[0]+k,arr[i+1]-k);
            mx=Math.max(arr[n-1]-k,arr[i]+k);
            ans=Math.min(ans,mx-mi);
        }
        System.out.println(ans);
    }
}
