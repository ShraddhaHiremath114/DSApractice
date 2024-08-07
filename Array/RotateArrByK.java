public class RotateArrByK {
    public static void rotateByk(int[] arr,int n,int k){
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[(i+k)%n]=arr[i];
        }
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        rotateByk(arr, n, k);
        // int[] ak=new int[k];
        // int ind=0;
        // for(int i=n-k;i<n;i++){
        //     ak[ind++]=arr[i];
        // }
        // for(int val:ak)System.out.print(val+" ");
        // System.out.println();
        
        // for(int i=n-k;i>0;i--){
        //     arr[i+k-1]=arr[i-1];
        //     // System.out.println(arr[i]);
        // }
        // for(int i=0;i<ak.length;i++){
        //     arr[i]=ak[i];
        // }
        for(int val:arr)System.out.print(val+" ");
    }
}
