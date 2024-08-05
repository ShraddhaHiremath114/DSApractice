public class PanagramCheck {
    public static boolean panCheck(String s){
        if(s==null)return false;
        String ls=s.toLowerCase();
        int[] arr=new int[123];
        //a=97 & z=122
        for(int i=0;i<ls.length();i++){
            int nch=ls.charAt(i);
            arr[nch]=1;
        }
        
        for(int i=97;i<=122;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="Bawds jog, flick quartz, vex nymph";
        System.out.println(panCheck(s));
    }
}
