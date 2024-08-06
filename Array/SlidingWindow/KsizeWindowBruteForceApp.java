public class KsizeWindowBruteForceApp{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        
        int k=3;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}