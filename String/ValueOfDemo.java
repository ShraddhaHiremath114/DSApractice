public class ValueOfDemo{
    public static void main(String[] args) {
        int i=1;
        System.out.println(((Object)i).getClass().getSimpleName());

        String str=String.valueOf(i);
        System.out.println(((Object)str.getClass().getSimpleName()));

        char ch[]={'j','a','v','a'};
        String sch=String.valueOf(ch);
        System.out.println(sch);

        ValueOfDemo  obj=new ValueOfDemo();
        System.out.println(obj);
        System.out.println(obj.getClass().getSimpleName());

        String objstr=String.valueOf(obj);
        System.out.println(objstr);
        System.out.println((Object)objstr.getClass().getSimpleName());

    }
    
}