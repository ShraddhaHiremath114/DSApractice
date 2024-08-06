public class FirstNegEleInWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr={-8,2,3,-6,10};
        int k=2;
        int n=arr.length;
        int[] ans=new int[n-k+1];
        int ind=0;
        for(int i=0;i<=n-k;i++){
            int flag=-1;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    flag=j;
                    ans[ind]=arr[j];
                    ind++;
                    break;
                }
                
            }
            if(flag==-1){
                ans[ind]=0;
                ind++;
            }
        }
        for(int val:ans)System.out.print(val+" ");
    }
}
