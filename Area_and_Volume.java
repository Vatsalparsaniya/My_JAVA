import java.util.Scanner;
abstract class Shape{

    abstract public void area();
    abstract public void vol();
}

class Cone extends Shape{
    int l,r;
    int a,v;
    Cone(int l,int r){
        this.l = l;
        this.r = r;
    }
    public void area(){
        a = 3.1415*r*l;
        System.out.println("The area of Cone is: "+a);
    }
    public void vol(){
        v = (3.1415*r*r*h)/3;
        System.out.println("The volume of Cone is: "+v);
    }
}

class Cylinder extends Shape{
    int r,h;
    int a,v;
    Cylinder(int r,int h){
        this.r = r;
        this.h = h;
    }
    public void area(){
        a = 2*3.1415*r*h;
        System.out.println("The area of Cylinder is: "+a);
    }
    public void vol(){
        v = 3.1415*r*r*h;
        System.out.println("The volume of Cylinder is: "+v);
    }
}

public class Area_and_Volume{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the radius and slant height of cone: ");
    int r = scan.nextInt();
    int l = scan.nextInt();
    Cone obj1 = new Cone(r,l);
    obj1.area();
    obj1.vol();

    System.out.println("Enter the radius and height of Cylinder: ");
    r = scan.nextInt();
    int h = scan.nextInt();
    Cylinder obj2 = new Cylinder(r,h);
    obj2.area();
    obj2.vol();
  }
}
