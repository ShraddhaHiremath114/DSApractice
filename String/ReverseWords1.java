


public class ReverseWords1 {
    public static void main(String[] args) {
        String str="i.like.java";//Output:- java.like.i
        int n=str.length();
        int ind=n-1;
        int end=n;

        String ans="";
        while(ind>=0){
            if(str.charAt(ind)=='.'){
                ans=ans+str.substring(ind+1, end);
                ans=ans+'.';
                end=ind;
            }
            
            if(ind==0){
                ans+=str.substring(ind, end);
        }
        ind--;
        }
        System.out.println(ans);
    }
}
