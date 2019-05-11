//Q.4) Define an Interface Shape with abstract method area().
//Write a java program to calculate an area of Circle and Sphere.(use final keyword)
import java.util.Scanner;

interface Shape{
    double area();
}
class Circle implements Shape{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Sphere implements Shape{
    float radius;
    Sphere(float radius){
        this.radius = radius;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
}
class ShapeDemo{
    public static void main(String[] args) {
        float radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = scan.nextFloat();
        Shape obj1 = new Circle(radius);
        Shape obj2 = new Sphere(radius);
        System.out.println("The area of circle is : "+ obj1.area());
        System.out.println("The area of sphere is : "+ obj2.area());
    }
}
