package safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("abc","xyz");
        List<String> l2 = Arrays.asList("123","999");
        List<String> l3 = Arrays.asList("xyz","xyz");

        SafeVarArgsDemo safeVarArgsDemo = new SafeVarArgsDemo();
        safeVarArgsDemo.myMethod(l1,l2,l3);

    }

    @SafeVarargs
    public final void myMethod(List<String>... l){

        String first = (String)l[0].get(0);
        String second = (String)l[1].get(0);

        System.out.println(first);
        System.out.println(second);

    }
}
