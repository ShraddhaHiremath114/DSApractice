public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr={1,2,3,-2,5};//9

        int sum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
