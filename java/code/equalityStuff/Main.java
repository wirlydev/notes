package equalityStuff;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("lets test stuff");

        //int
        int a = 67;
        int b = 67;

        System.out.println("does a == b when both are int?");
        System.out.println(a==b ? "yes" : "no");
        System.out.println();

        //Integer
        Integer c = 67;
        Integer d = 67;
    
        System.out.println("does c == d when both are Integer?");
        System.out.println(c==d ? "yes" : "no");
        System.out.println();

        c = 128;
        d = 128;

        System.out.println("does c == d when both are Integer and the value is over > 127 or < -128?");
        System.out.println(c==d ? "yes" : "no");
        System.out.println();

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("does s1 == s2 when both are String?");
        System.out.println(s1==s2 ? "yes" : "no");
        System.out.println();

        System.out.println("does s1.equals(s2) when both are String?");
        System.out.println(s1.equals(s2) ? "yes" : "no");
        System.out.println();

        Thanos t = new Thanos();
        t.setName("Brandon");

        Thanos t2 = new Thanos();
        
        System.out.println("does t == t2 when both new Thanos?");
        System.out.println(t == t2 ? "yes" : "no");
        System.out.println();

        System.out.println("does t.equals(t2) when both new Thanos?");
        System.out.println(t.equals(t2) ? "yes" : "no");
        System.out.println();

        t2 = t;

        System.out.println("does t.equals(t2) when t2 points to t?");
        System.out.println(t.equals(t2) ? "yes" : "no");
        System.out.println();

        System.out.println("does t == t2 when t2 points to t?");
        System.out.println(t == t2 ? "yes" : "no");
        System.out.println();

        t2 = new Thanos();
        t2.setName("Brandon");

        System.out.println("does t.equals(t2) when we overide .equals to do a deep comparison?");
        System.out.println(t.equals(t2) ? "yes" : "no");
        System.out.println();
        
    }
}
