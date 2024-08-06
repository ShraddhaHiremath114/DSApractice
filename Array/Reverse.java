public class Reverse {
    public static String revStr(String str){
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        String rev=String.valueOf(arr);
        return rev;
    }
    public static void main(String[] args) {
        String str="shraddha";
        

        System.out.println("Reversed String");
        System.out.println(revStr(str));

        int[] a={1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int val:a)System.out.print(val+" ");

    }
}
