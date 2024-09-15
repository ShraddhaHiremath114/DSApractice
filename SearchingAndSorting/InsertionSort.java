public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        int n=arr.length;
        for(int val:arr)System.out.print(val+" ");
        System.out.println();
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int val:arr)System.out.print(val+" ");
    }
}
