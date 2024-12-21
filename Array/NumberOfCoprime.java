public class NumberOfCoprime {
    public static int findgcd(int x,int y){
        if(y==0)return x;
        return findgcd(y,x%y);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans=findgcd(arr[i],arr[j]);
                if(ans==1){
                    count++;
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
