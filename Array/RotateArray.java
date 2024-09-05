public class RotateArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        //LeftShif(Anti-clockwise)- 2,3,4,5,1
        
        int first=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
        for(int val:arr)System.out.print(val+" ");
        

        //RightShift(clockwise)- 5,1,2,3,4
        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int val:arr)System.out.print(val+" ");
    }
}