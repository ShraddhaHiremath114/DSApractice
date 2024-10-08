public class SortedOrNot{
    public static boolean fun(int[] arr,int index){
        if(arr.length==1)return true;
        if(index==arr.length)return true;
        if(arr[index-1]>arr[index])return false;

        return fun(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(fun(arr,1));
    }
}