public class MaxSumConfig {
    static int maxSum=Integer.MIN_VALUE;
    public static void printArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
    public static void calcMaxSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i]*i;
        }
        maxSum=Math.max(maxSum, sum);
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int arr[]={8,3,1,2};
        int n=arr.length;
        calcMaxSum(arr);
        
        for(int i=0;i<n-1;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
            printArr(arr);
            calcMaxSum(arr);
            System.out.println();
        }
    }
}
