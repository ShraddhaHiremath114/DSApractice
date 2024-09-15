public class VarargsDemo {
    public static int calcSum(int... args){
        int sum=0;
        for(int val:args){
            sum+=val;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calcSum(2,3,1));
    }
}
