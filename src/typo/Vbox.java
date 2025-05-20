package typo;

import java.awt.Graphics;

public class Vbox extends Group {
    private double lineSkip;

    public Vbox (double lineSkip) {
        this.lineSkip = lineSkip;
    }

    @Override
    public void add(Box b) {
        width = Math.max(getWidth(), b.getWidth());
        if (list.isEmpty()) {
            ascent = b.getAscent();
        } else {
            ascent = getAscent() + list.getLast().getDescent() + lineSkip + b.getAscent();
        }
        descent = b.getDescent();
        stretchingCapacity = Math.max(getStretchingCapacity(), b.getStretchingCapacity());
        super.add(b);
    }

    @Override
    public String toString() {
        return "Vbox" + super.toString();
    }

    @Override
    public boolean doDraw(Graphics graph, double x, double y, double w) {
        double yNew = y;
        boolean success = true;
        for (Box b: list) {
            success = success && b.doDraw(graph, x, yNew, w);
            yNew +=  lineSkip + b.getAscent() + b.getDescent();
        }

        return success;
    }
}
