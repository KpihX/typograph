package typo;

import java.awt.Graphics;

public class Space extends Box {
    final private double width;
    final private double stretchingCapacity;

    public Space (double widthMin, double strechCap) {
        width = widthMin;
        stretchingCapacity = strechCap;
    }

    @Override
    public boolean doDraw(Graphics graph, double x, double y, double w) {
        return true;
    }

    @Override
    public double getAscent() {
        return 0;
    }

    @Override
    public double getDescent() {
        return 0;
    }

    @Override
    public double getWidth() {
        return width;
    }
    
    @Override
    public double getStretchingCapacity() {
        return stretchingCapacity;
    };

    @Override
    public String toString() {
        return "Space" + super.toString();
    }
}
