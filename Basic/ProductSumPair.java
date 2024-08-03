import java.util.Arrays;

public class ProductSumPair {
    public static void main(String[] args) {
        int[] arr={5,2,4,3,9,7,1};
        Arrays.sort(arr);
        int x=arr[0];
        int y=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=x){
                y=arr[i];
                break;
            }
                
        }
        System.out.println(x+" "+y);
        int sum=9;
        int currsum=x+y;
        int ans=1;
        if(currsum<=sum){
            ans=x*y;
        }
        System.out.println(ans);
    }
}
