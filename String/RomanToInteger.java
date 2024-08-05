

import java.util.HashMap;

public class RomanToInteger{
    //V->5 | III-3 | LI-51
    public static void main(String[] args) {
        System.out.println("Roman To Integer: ");
        String str="III";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M', 1000);

        int result=0;
        for(int i=0;i<str.length();i++){
            if(i>0 && str.charAt(i)>str.charAt(i-1)){
                result+=map.get(str.charAt(i))-2*map.get(str.charAt(i-1));
            }
            else{
                result+=map.get(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}