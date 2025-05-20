package typo;

import java.awt.Graphics;

public class Hbox extends Group {
    @Override
    public void add(Box b) {
        super.add(b);
        width += b.getWidth();
        ascent = Math.max(getAscent(), b.getAscent());
        descent = Math.max(getDescent(), b.getDescent());
        stretchingCapacity += b.getStretchingCapacity();
    }

    @Override
    public String toString() {
        return "Hbox" + super.toString();
    }

    @Override
    public boolean doDraw(Graphics graph, double x, double y, double w) {
        double mw = getWidth(), shift = 0;
        if (mw > w) {
            for (Box b: list) {
                b.doDraw(graph, x + shift, y + (getAscent() -b.getAscent()), b.getWidth());
                shift += b.getWidth();
            }
            return false;
        }

        double d = w - mw, newW, strechCap = getStretchingCapacity();
        if (strechCap == 0) {
            doDraw(graph, x, y, mw-1); // Because the drawing will only be done on a space of size mw, since the text can't be streched.
            return true;
        }

        for (Box b: list) {
            newW = b.getWidth() + b.getStretchingCapacity() * d / getStretchingCapacity();
            b.doDraw(graph, x + shift, y + (getAscent() -b.getAscent()), newW);
            shift += newW;
        }

        return true;
    }
}
