import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int arr[]={1,3,3};
        int n=arr.length;
        int nsum=n*(n+1)/2;
        int r=0;
        // System.out.println(nsum);
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                r=arr[i];break;
            }
        }
        System.out.println(r);

        int csum=0;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]!=arr[i+1]){
                csum+=arr[i];
            }
            
        }
        csum+=arr[arr.length-1];
        int missingNo=nsum-csum;
        System.out.println(missingNo);
    }
}
