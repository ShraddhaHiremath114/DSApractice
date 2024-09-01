import java.util.*;
public class ChocolateDistributionProblem {

    public static int find(int[] arr,int n,int m){
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            ans=Math.min(ans, diff);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,7,9,9,12,56};

        int n=arr.length;
        int m=5;

        System.out.println(find(arr,n,m));
    }

    
}
