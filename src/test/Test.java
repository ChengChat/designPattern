package test;

import adapter.Duck;
import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Test extends T {
    private static String dfg;
    private static String gg;
    private static String aagg = "s";

    public Test() {
    }
    public Test(String a) {
        System.out.println("sdfdsfs");
    }
    static {
        System.out.println("wolaile");
    }
    byte dsf;
    final int aj = 3 + dsf;

    public static void main(String[] args) {
        Test test = new Test("sdf");
        gg = gg + "sdf";
        System.out.println(gg);
        String a = "s";
        String b = "s";
        System.out.println("zheli ");
        switch (b){
            case "s":
                System.out.println(b);
                break;
            case "d":
                System.out.println(b);
                break;
            default:
                System.out.println("dfsd");
        }

        System.out.println(b == a);
        test.dsf = 4;
            System.out.println(Test.class.getClassLoader());
        System.out.println(test.aj);
        Map<Object, Object> objectObjectMap = new HashMap<>();
        /*try {
            Class<Test> aClass = (Class<Test>) Class.forName("test.Test");
            Test test1 = aClass.newInstance();
            System.out.println(test1.aj);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}
