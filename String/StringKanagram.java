import java.util.ArrayList;

public class StringKanagram {
    public static boolean findKanagrm(String s1,String s2,int k)
    {
        int count=0;
        if(s1.length()!=s2.length())return false;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            list.add(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(list.contains(ch)){
                count++;
                list.remove(Character.valueOf(ch));
            }
        }
        if(s1.length()-count<=k)
            return true;
        
        return true;
    }
    public static void main(String[] args) {
        /*
         * Str1 = "fodr"
         * Str2 = "gork"
         * K = 2
         * return donhi string madhe kiti characters diff aahet
         * in above eg if we replace fd by gk both will contain same characters : o/p is 2
         */
        String s1="fodr";
        String s2="gork";
        int k=2;
        boolean ans=findKanagrm(s1,s2,k);
        System.out.println(ans);
    }
}
