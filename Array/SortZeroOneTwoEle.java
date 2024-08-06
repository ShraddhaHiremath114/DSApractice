public class SortZeroOneTwoEle {
    public static void main(String[] args) {
        int[] arr={0,2,1,2,1,1,0,2};
        for(int val:arr)System.out.print(val+" ");

        int zc=0,oc=0,tc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)zc++;
            else if(arr[i]==1)oc++;
            else
            tc++;
        }

        int i=0;
        while(zc>0){
            arr[i++]=0;
            zc--;
        }
        while(oc>0){
            arr[i++]=1;
            oc--;
        }
        while(tc>0){
            arr[i++]=2;
            tc--;
        }
        System.out.println();
        for(int val:arr)System.out.print(val+" ");
    }
}
