package typo;

import java.util.LinkedList;

public abstract class Group extends Box {
    protected final LinkedList<Box> list = new LinkedList<Box>();

    protected double ascent;
    protected double descent;
    protected double width;
    protected double stretchingCapacity;

    public void add(Box b) {
        list.add(b);
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getAscent() {
        return ascent;
    }

    @Override
    public double getDescent() {
        return descent;
    }

    @Override
    public double getStretchingCapacity() {
        return stretchingCapacity;
    }

    @Override
    public String toString() {
        String result = super.toString() + "{\n";

        for (Box b: list) {
            // System.out.println("**" + b.toString());
            result += "\t" + b.toString().replaceAll("\n", "\n\t") + ",\n";
        }

        result += "}";

        return result;
    }
}
