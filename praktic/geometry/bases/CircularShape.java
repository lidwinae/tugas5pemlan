package praktic.geometry.bases;

public abstract class CircularShape extends Shape {
    private double radius;
    protected final int PI_NUMERATOR = 22;
    protected final int PI_DENOMINATOR = 7;

    public CircularShape() {}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}