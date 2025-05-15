package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

public class Square extends Shape implements TwoDimensional {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super();
        setName("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Area", getArea(),
                "Perimeter", getPerimeter());
    }
}