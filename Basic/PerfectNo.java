class PerfecrNo{
    public static boolean checkPerfectNumber(int num) {
        if(num==1)return false;
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                sum+=i;
            }
        }
        if(sum==num)return true;
        return false;
    }
    public static void main(String[] args) {
        int num=1;
        boolean ans=checkPerfectNumber(num);
        System.out.println(ans);
    }
}