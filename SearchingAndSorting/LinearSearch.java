public class LinearSearch{
    public static int find(int[] arr,int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
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