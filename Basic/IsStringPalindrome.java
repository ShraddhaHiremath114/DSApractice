public class IsStringPalindrome {
    public static void main(String[] args) {
        String str="nayan";

        
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }

        String temp="";
        for(int k=0;k<arr.length;k++){
            temp+=arr[k];
        }

        if(str.equals(temp)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
