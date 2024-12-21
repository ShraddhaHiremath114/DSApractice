import java.util.*;
public class Prach {
    public static void main(String[] args) {
        Map<Integer,String> mp=new HashMap<>();

        mp.put(1,"Shraddha");
        mp.put(2,"Viresh");

        Scanner sc=new Scanner(System.in);
        String ioname=sc.next();

        int flag=0;
        int ind=-1;
        for(int i=0;i<mp.size();i++){
            String nio=ioname.toLowerCase();
            char f=nio.charAt(0);
            String fletter=String.valueOf(f);
            String secondpart="";
        
            if(mp.containsValue(ioname)){
                flag=1;
                ind=i;
            }
        }

        if(flag==1){
            System.out.println(ind);
        }else{
            System.out.println(-1);
        }
    }
}
