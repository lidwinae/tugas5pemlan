package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass;

    public Sphere() {
        super();
        setName("3D Weightable Sphere"); // buat default untuk nama sphere
    }

    public Sphere(double radius, double mass) {
        super();
        setName("Sphere");
        setRadius(radius);
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * getRadius() * getRadius() * PI_NUMERATOR / PI_DENOMINATOR ;
    }

    @Override
    public double getVolume() {
        return 4 * getRadius() * getRadius() * getRadius() * PI_NUMERATOR / PI_DENOMINATOR / 3;
    }

    @Override
    public double getWeight() {
        return mass * g;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Surface Area", getSurfaceArea(),
                "Volume", getVolume(),
                "Weight", getWeight());
    }
}