import java.awt.Font;
import typo.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // test2();
        // test3();
        // test5();
        test6();
    }
    static void test2() {
        Font f = new Font("SansSerif", Font.PLAIN, 70);
        Glyph g = new Glyph(f, 'g');
        System.out.println(g);
    }

    static void test3() {
        Font f = new Font("SansSerif", Font.PLAIN, 70);
        Glyph g = new Glyph(f, 'g');
        System.out.println(g);
        new Page(g, 150, 150);
    }

    static void test5() {
        Font font = new Font("SansSerif", Font.PLAIN, 70);
        Space s = new Space(2, 3);
        Space f = new FixedSpace(5);
        Space r = new RelativeSpace(0.5, font);
        
        System.out.println(s);
        System.out.println(f);
        System.out.println(r);
    }

    static void test6() {
        Group g1 = new TestableGroup();
        Group g2 = new TestableGroup();
        Font font = new Font("SansSerif", Font.PLAIN, 70);
        Space s = new Space(2, 3);
        Space f = new FixedSpace(5);
        Space r = new RelativeSpace(0.5, font);

        g2.add(s);
        g2.add(f);
        g1.add(g2);
        g1.add(r);

        System.out.println(g1);
    }
}
