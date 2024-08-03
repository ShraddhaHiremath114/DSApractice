public class PasswordCheck {
    public static int checkPass(String str,int n){
        if(n<4)
            return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
            return 0;

        int di=0,cap=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='/')
                return 0;
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                di++;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                cap++;
            
        }
        if(di>0 && cap>0)return 1;
        return 0;
    }
    public static void main(String[] args) {
        /*
        1.At least 4 characters
        2.At least one numeric digit
        3.At least one Capital letter
        4.Must not have space or slash
        5.Starting character must not be a number
        */ 
        String pass="Shra11";
        int ans=checkPass(pass, pass.length());
        if(ans!=0)
            System.out.println("Valid");
        else        
            System.out.println("Not");
    }
}
