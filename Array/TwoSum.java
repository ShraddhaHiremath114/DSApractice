public class TwoSum {
    public static void main(String[] args) {
        int[] arr={16,8,23,4,15};
        int ans[]=new int[2];
        int n=arr.length;
        int target=19;
        //Brute Force Approach
        for(int i=0;i<n-1;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;break;
                }
            }
        }
        for(int val:ans)System.out.print(val+" ");

    }
}
