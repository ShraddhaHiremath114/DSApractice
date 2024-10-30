public class BubbleSort {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        int n=arr.length;
        for(int val:arr)System.out.print(val+" ");
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int val:arr)System.out.print(val+" ");
        System.out.println();
        //Bubble sort
        int[] sortarr={6,5,3,1};
        bubblesort(sortarr);
    }
}
