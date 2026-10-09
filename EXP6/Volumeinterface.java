Aim
To write a Java program to calculate the volume of a cylinder and the surface area of a sphere using interfaces.

Algorithm
Start the program.
Import the Scanner class to get input from the user.
Create an interface Shape with a constant pi and a method area() to calculate the area of a sphere.
Create an interface CylinderShape with a constant pie and a method volume() to calculate the volume of a cylinder.
Create a class Cylinder that implements the CylinderShape interface and defines the volume() method.
Create a class Sphere that implements the Shape interface and defines the area() method.
In the main() method, read the radius and height from the user.
Create objects of the Cylinder and Sphere classes.
Calculate and display the volume of the cylinder and the area of the sphere.
Close the scanner.
Stop the program.

//program:

import java.util.Scanner;
interface Shape {
    float pi = 3.14f;
    float area(int r);
}
interface CylinderShape {
    float pie = 3.14f;
    float volume(int r, int h);
}
class Cylinder implements CylinderShape {
    public float volume(int r, int h) {
        return pie * r * r * h;
    }
}
class Sphere implements Shape {
    public float area(int r) {
        return 4 * pi * r * r;
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        int r, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius & height: ");
        r = sc.nextInt();
        h = sc.nextInt();
        Cylinder c1 = new Cylinder();
        Sphere s1 = new Sphere();
        System.out.println("Volume of Cylinder: " + c1.volume(r, h));
        System.out.println("Area of Sphere: " + s1.area(r));
        sc.close();
    }
}

//Result:
Thus, the Java program to calculate the volume of a cylinder and the surface area of a sphere using interfaces was executed successfully.