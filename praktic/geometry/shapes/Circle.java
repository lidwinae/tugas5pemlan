package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

public class Circle extends CircularShape implements TwoDimensional {
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        setName("Circle");
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * PI_NUMERATOR / PI_DENOMINATOR;
    }

    @Override
    public double getPerimeter() {
        return 2 * getRadius() * PI_NUMERATOR / PI_DENOMINATOR;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Area", getArea(),
                "Perimeter", getPerimeter());
    }
}