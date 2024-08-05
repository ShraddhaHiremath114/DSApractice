import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsIMP {
    public static boolean isomorphicStrings(String str1,String str2){
        if(str1.length()!=str2.length())return false;

        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(map.containsKey(ch)){
                char ch2=map.get(str1.charAt(i));
                if(str2.charAt(i)!=ch2){
                    return false;
                }
            }else{
                map.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
    }
    public static boolean findIS(String s1,String s2){
        HashMap<Character,Character> map=new HashMap<>();
        if(s1.length()!=s2.length())return false;

        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(! map.containsKey(c1)){
                if(! map.containsValue(c2)){
                    map.put(c1, c2);
                }else{
                    return false;
                }
            }else{
                if(map.get(c1)!=c2){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
         * for aab - > xxy
         */
        String s1="aab";
        String s2="xxy";
        boolean ans=findIS(s1,s2);
        System.out.println(ans);
    }
}
