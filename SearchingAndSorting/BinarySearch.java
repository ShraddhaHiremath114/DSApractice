public class BinarySearch {
    public static int find(int[] arr,int n,int key){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(key<arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        int n=arr.length;
        int key=5;
        System.out.println(find(arr,n,key));
    }
}
