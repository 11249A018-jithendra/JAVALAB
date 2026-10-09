
import java.util.Scanner;
interface Shape {
    double volume(double r);
}
interface CylinderShape {
    double volume(double r, double h);
}
class Cylinder implements CylinderShape {
    public double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}

class Sphere implements Shape {
    public double volume(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
public class Volumeinterface  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Cylinder c = new Cylinder();
        Sphere s = new Sphere();
        System.out.printf("Volume of Cylinder: %.2f%n", c.volume(r, h));
        System.out.printf("Volume of Sphere: %.2f%n", s.volume(r));
        sc.close();
    }
}