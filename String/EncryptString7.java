public class EncryptString7 {
    public static void main(String[] args) {
        // aaaaaaaaaaa -> 11 times : o/p is ba
        //abc -> a1b1c1 : op is 1c1b1a
        
        String str="abc";
        String ans="";
        for(int i=0;i<str.length();i++){
            long count=1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans=Long.toHexString(count)+str.charAt(i)+ans;
        }
        System.out.println(ans);
    }
}
