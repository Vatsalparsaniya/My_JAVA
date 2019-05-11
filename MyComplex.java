import java.util.Scanner;
//import Complex;

public class MyComplex{

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the real and imaginary part of first complex number:");
      int real = scan.nextInt();
      int img = scan.nextInt();
      Complex a = new Complex(real,img);

      System.out.println("Enter the real and imaginary part of second complex number:");
      real = scan.nextInt();
      img = scan.nextInt();
      Complex b = new Complex(real,img);

      Complex sumv = Complex.sum(a,b);
      System.out.println("The addition of two complex number is:");
      System.out.println(sumv.real + "+ (" + sumv.img+ ")i");
      Complex subv = Complex.sub(a,b);
      System.out.println("The difference of two complex number is:");
      System.out.println(subv.real + "+ (" + subv.img+ ")i");
      Complex mulv = Complex.mul(a,b);
      System.out.println("The multiplication of two complex number is:");
      System.out.println(mulv.real + "+ (" + mulv.img+ ")i");
  }
}
