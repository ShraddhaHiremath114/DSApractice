public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,1};
        int frq=0;
        int k=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)frq++;
        }
        System.out.println(frq);

        
    }
}
