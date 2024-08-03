public class MoveHyphen {
    public static void main(String[] args) {
        String str="shraddha-hiremath";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                ans=str.charAt(i)+ans;
            }else{
                ans=ans+str.charAt(i);
            }
        }
        System.out.println(str);
        System.out.println(ans);
    }
}
