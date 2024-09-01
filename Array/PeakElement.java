public class PeakElement{
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=arr.length;
        System.out.println(findPeakEle(arr,n));
    }

    private static int findPeakEle(int[] arr,int n) {
        if(n==1){
            return 0;//2
        }
        if(n>1){
            if(arr[0]>arr[1])return 0;//4 2 3
            if(arr[n-1]>arr[n-2])return n-1;//1 4 6
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])return i;//121
        }
        return -1;
    }
}