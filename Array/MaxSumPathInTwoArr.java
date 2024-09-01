public class MaxSumPathInTwoArr {
    public static void main(String[] args) {
        int[] arr1={2,3,7,10,12};
        int[] arr2={1,5,7,8};

        int m=arr1.length;
        int n=arr2.length;

        int suma=0,sumb=0,i=0,j=0,ans=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                suma+=arr1[i];
                i++;
            }else if(arr2[j]<arr1[i]){
                sumb+=arr2[j];
                j++;
            }else{
                ans+=Math.max(suma,sumb);
                suma=0;
                sumb=0;
                while(arr1[i]==arr2[j] && i<m && j<n){
                    ans=ans+arr1[i];
                    i++;
                    j++;
                }

            }
        }
        while(i<m){
            suma+=arr1[i];
            i++;
        }
        while(j<n){
            sumb+=arr2[j];
            j++;
        }
        ans+=Math.max(suma,sumb);
        System.out.println(ans);
    }
}
