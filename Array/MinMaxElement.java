import java.util.Arrays;

public class MinMaxElement{
    public static void main(String[] args) {
        int[] arr={3,2,1,56,1000,67};//1 1000
        int n=arr.length;
        //Solution 1
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);

        //Solution 2
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi)maxi=arr[i];
            if(arr[i]<mini)mini=arr[i];
        }
        System.out.println(mini+" "+maxi);
    }
}