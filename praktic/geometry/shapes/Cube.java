package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;
    private double mass;

    public Cube() {
        super();
        setName("3D Weightable Cube"); // buat default untuk nama cube
    }

    public Cube(double edge, double mass) {
        super();
        setName("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
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