package praktic.geometry.mains;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Cube;
import praktic.geometry.shapes.Sphere;
import praktic.geometry.shapes.Square;

import java.util.Scanner;

/* Lidwina Eleonora Dora - 235150707111019

//        //  //////    //      //  //  //\\    //    ////
//        //  //    //  //      //  //  // \\   //  //    //
//        //  //    //  //  //  //  //  //  \\  //  ////////
//        //  //    //  //  //  //  //  //   \\ //  //    //
////////  //  //////      //  //    //  //    \\//  //    //

*/

public class ShapeCalculator {
    public static void main(String[] args) {
        // scanner
        Scanner lidwina = new Scanner(System.in);

        // pewarna tulisan
        String BOLD_ORANGE = "\033[1;38;5;208m";
        String RESET = "\u001B[0m";

        // string untuk input output
        String garis = BOLD_ORANGE + "======================================" + RESET;
        String radius = String.format("%-16s%-2s", "Enter radius", ":");
        String side = String.format("%-16s%-2s", "Enter side", ":");
        String edge = String.format("%-16s%-2s", "Enter edge", ":");
        String mass = String.format("%-16s%-2s", "Enter mass", ":");

        // output nama aplikasi
        System.out.println(garis);
        System.out.println("Shape Calculator");
        System.out.println("Lidwina Eleonora Dora");
        System.out.println("235150707111019");
        System.out.println(garis);

        // circle
        // penerapan polymorphism dengan CircularShape
        CircularShape circle = new Circle();
        circle.setName("2D Circle"); // set nama circle karena default namanya belum ada
        System.out.println(circle.getName());
        System.out.println(garis);
        System.out.print(radius);

        // menggunakan method overload
        CircularShape circles = new Circle(lidwina.nextDouble());
        System.out.println(garis);
        circles.printInfo();
        System.out.println(garis);

        // square
        // penerapan polymorphism dengan Shape
        Shape square = new Square();
        square.setName("2D Square"); // set nama square lagi karena default kosong
        System.out.println(square.getName());
        System.out.println(garis);
        System.out.print(side);

        // menggunakan method overload
        Shape squares = new Square(lidwina.nextDouble());
        System.out.println(garis);
        squares.printInfo();
        System.out.println(garis);

        // cube
        // penerapan polymorphism dengan Shape
        Shape cube = new Cube();
        System.out.println(cube.getName());
        System.out.println(garis);
        System.out.print(edge);
        double edge1 = lidwina.nextDouble();
        System.out.print(mass);

        // menggunakan method overload
        Shape cubes = new Cube(edge1, lidwina.nextDouble());
        System.out.println(garis);
        cubes.printInfo();
        System.out.println(garis);

        // sphere
        // penerapan polymorphism dengan CircularShape
        CircularShape sphere = new Sphere();
        System.out.println(sphere.getName());
        System.out.println(garis);
        System.out.print(radius);
        double radius1 = lidwina.nextDouble();
        System.out.print(mass);

        // menggunakan method overload
        CircularShape spheres = new Sphere(radius1, lidwina.nextDouble());
        System.out.println(garis);
        spheres.printInfo();
        System.out.println(garis);

        // polymorphism interface
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println(garis);
        System.out.print(edge);
        double edge2 = lidwina.nextDouble();
        System.out.print(radius);
        double radius2 = lidwina.nextDouble();
        System.out.print(mass);
        double m = lidwina.nextDouble();
        System.out.println(garis);

        // penerapan polymorphism dengan ThreeDimensional
        ThreeDimensional c = new Cube(edge2,m);
        ThreeDimensional s = new Sphere(radius2,m);
        Weightable cs = new Sphere(radius2, m);
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Cube's Volume", c.getVolume(),
                "Sphere's Volume", s.getVolume(),
                "Weight", cs.getWeight());
        System.out.println(garis);
    }
}