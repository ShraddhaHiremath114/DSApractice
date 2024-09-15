public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Shraddha");
        System.out.println(sb.charAt(0));
        System.out.println(sb.indexOf("p"));//-1
        sb.delete(4, 5);
        sb.deleteCharAt(2);
        System.out.println(sb);//Shadha

        System.out.println(sb.lastIndexOf("h"));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.indexOf("S"));
    }
}
