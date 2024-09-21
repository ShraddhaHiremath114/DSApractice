public class MergeSort {
    public static void conquer(int[] arr,int s,int mid,int e){
        int merged[]=new int[e-s+1];
        int i1=s;
        int i2=mid+1;
        int k=0;

        while(i1<=mid && i2<=e){
            if(arr[i1]<=arr[i2]){
                merged[k++]=arr[i1++];
            }else{
                merged[k++]=arr[i2++];
            }
        }
        while(i1<=mid){
            merged[k++]=arr[i1++];
        }
        while (i2<=e) {
            merged[k++]=arr[i2++];
        }
        for(int i=0,j=s; i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conquer(arr, s, mid, e);
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        int n=arr.length;
        System.out.println("Merge Sort Algorithm");
        for(int val:arr)System.out.print(val+" ");
        System.out.println();
        divide(arr, 0, n-1);
        for(int val:arr)System.out.print(val+" ");

    }
}
