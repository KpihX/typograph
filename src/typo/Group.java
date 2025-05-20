package typo;

import java.util.LinkedList;

public abstract class Group extends Box {
    protected final LinkedList<Box> list = new LinkedList<Box>();

    private double ascent;
    private double descent;
    private double width;
    private double stretchingCapacity;

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
            result += "\t" + b.toString().replaceAll("\t", "\t\t").replaceAll("}", "\t}") + ",\n";
        }

        result += "}";

        return result;
    }
}
