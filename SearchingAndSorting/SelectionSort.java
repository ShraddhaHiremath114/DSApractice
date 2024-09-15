public class SelectionSort {
    public static int findMin(int[] arr,int start,int n){
        int min=start;
        for(int i=start;i<n;i++){
            if(arr[i]<arr[min])min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        int n=arr.length;
        for(int val:arr)System.out.print(val+" ");
        System.out.println();
        for(int i=0;i<n;i++){
            int min=findMin(arr,i,n);
            // System.out.println(arr[min]);
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int val:arr)System.out.print(val+" ");
    }
}
