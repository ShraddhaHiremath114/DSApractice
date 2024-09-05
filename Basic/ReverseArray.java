public class ReverseArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        for(int val:arr)System.out.print(val+" ");
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        for(int val:arr)System.out.print(val+" ");
    }
}