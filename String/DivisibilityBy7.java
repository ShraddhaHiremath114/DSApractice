public class DivisibilityBy7 {
    public static void main(String[] args) {
        String str="47";
        int rem=0;
        for(int i=0;i<str.length();i++){
            int digit=Character.getNumericValue(str.charAt(i));
            rem=(rem*10+digit)%7;
        }
        if(rem==0){
            System.out.println(str+" is divisible by 7");
        }else{
            System.out.println(str+" Not divisible by 7");
        }
    }
}
