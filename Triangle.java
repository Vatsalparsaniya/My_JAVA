import java.lang.*;
class Triangle{
  private double s1,s2,s3;
  Triangle(){
    s1 = 10;
    s2 = 10;
    s3 = 10;
  }
  Triangle(double s1,double s2 ,double s3) throws IllegalArgumentException{
    if(s1>s2+s3 || s2>s1+s3 || s3>s1+s2){
      throw new IllegalArgumentException(s1,s2,s3);
    }
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }
  private double T_area;
  void setArea(double s1,double s2,double s3){
    double s = (s1+s2+s3)/2;
    T_area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
  }
  private double T_perimeter;
  void setPerimeter(double s1,double s2,double s3){
    T_perimeter = s1+s2+s3;
  }
  double getArea(){
    return T_area;
  }
  double getperimeter(){
    return T_perimeter;
  }
  public String toString(){
    return "Tringle: side1 = "+s1+" side2 = "+ s2+" side3 = " + s3 + " T_area = " + getArea() + " T_perimeter =" +getperimeter();
  }
  public static void main(String[] args)throws Exception{
    Triangle T1 = new Triangle(10,10,10);
    T1.setArea(T1.s1,T1.s2,T1.s3);
    T1.setPerimeter(T1.s1,T1.s2,T1.s3);
    System.out.print(T1.toString());
  }
}

class IllegalArgumentException extends Exception{
  IllegalArgumentException(){  }
  IllegalArgumentException(double s1,double s2,double s3){
    System.out.print("oyyyyy Errror che ........\n");
    System.out.print("one side is greater then sum of other two side \n");
  }
}
