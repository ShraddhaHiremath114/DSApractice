public class ReplaceCH12{
    public static void main(String[] args) {
        String str="apple";
        char ch1='a';
        char ch2='p';

        String ans="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1)
                ans=ans+ch2;
            else if(str.charAt(i)==ch2)
                ans=ans+ch1;
            else
                ans=ans+str.charAt(i);
        }
        System.out.println(str);
        System.out.println(ans);
    }
}