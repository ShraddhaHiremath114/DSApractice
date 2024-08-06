public class OptimalApp {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};//24
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxi=sum;
        int start=0;
        int end=k;
        while(end<arr.length){
            sum-=arr[start];
            start++;
            sum+=arr[end];
            end++;
            maxi=Math.max(maxi,sum);
        }
        System.out.println(maxi);
    }

}
