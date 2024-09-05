public class ReverseString {
    public static void main(String[] args) {
        String str="abc";
        //Method 1
        StringBuilder sb=new StringBuilder(str);
        // sb.append(str);
        sb.reverse();
        System.out.println(sb);

        //Method 2
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
