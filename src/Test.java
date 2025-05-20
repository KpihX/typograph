import java.awt.Font;
import typo.Glyph;

public class Test {
    public static void main(String[] args) throws Exception {
        // test2();
        test3();
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
}
