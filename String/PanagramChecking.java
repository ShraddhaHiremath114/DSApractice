public class PanagramChecking {
    public static boolean findPanagram(String str){
        String s=str.toLowerCase();
        int alpha[]=new int[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z')
            alpha[c-'a']++;
        }
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=1){
                return false;
            }
        }
        return true;
    }
        
    
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str.length());
        boolean ans=findPanagram(str);
        System.out.println(ans);

     
    }
}
