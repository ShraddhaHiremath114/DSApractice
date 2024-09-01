public class MaximumInd {
    public static int find(int[] arr,int n,int i,int j){
        while(i<=j){
            if(arr[i]<=arr[j]){
                System.out.println(j+" "+i);
                return j-i;
            }else {
                i++;
                j--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={34,8,10,3,2,80,30,33,1};
        int n=arr.length;
        int i=0;
        int j=n-1;
        
        System.out.println(find(arr,n,i,j));
    }
}
