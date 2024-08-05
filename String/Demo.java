import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
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
    public static void main(String[] args) {
        // String[] arr={"ab","abe","abc","ad","a"};
        // Arrays.sort(arr);
        // for(String val:arr){
        //     System.out.print(val+" ");
        // }

        // String ans="";
        // System.out.println(ans.length());

        String str1="aac";
        String str2="xxy";

        System.out.println(isomorphicStrings(str1,str2));
    }
}
