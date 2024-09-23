import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        // Boxing and UnBoxing :-->

        // Boxing : converting primitive data into wrapper class
        int a = 10;
        Integer b = new Integer(a); // Old or outdated boxing
        System.out.println(b);

        Integer c = a; // autoboxing
        System.out.println(c);

        // Unboxing : converting wrapper class into primitive type
        Integer xy = 200;
        int yz = xy.intValue(); // unboxing
        System.out.println(yz);

        int ab = xy; // autounboxing
        System.out.println(ab);

        // eg

        Integer x = 10; // boxing
        Integer y = 20; // boxing
        Integer z = x + y; // it will unbox x & y then x+y = 30; and then 30 again boxed in z

        // Converting types to different data types :

        String s = "12345";
        int i = Integer.parseInt(s);
        System.out.println(i);

        // Arraylist eg

        ArrayList list = new ArrayList();
        list.add(x);
        list.add(y);
        list.add(new Integer(z));

        // Type conversion using boxing

        int p = 10;
        Integer q = p; // auto-boxing

        System.out.println("Byte value : " + q.byteValue());
        System.out.println("short value :" + q.shortValue());
        System.out.println("Int value : " + q.intValue());
        System.out.println("Long value : " + q.longValue());
        System.out.println("float value :" + q.floatValue());
        System.out.println("Double value : " + q.doubleValue());

        // contains info about related primitive type.
        System.out.println("int size (in bits): " + Integer.SIZE);
        System.out.println("int max value: " + Integer.MAX_VALUE);
        System.out.println("int min value: " + Integer.MIN_VALUE);

    }
}