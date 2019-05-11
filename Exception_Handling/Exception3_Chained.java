import java.lang.*;
import java.util.*;

class MyException extends Exception{
  String message;
  MyException(String m){
    this.message = m;
  }
  public String toString(){
    return "\nMyException Message : " +this.message;
  }
}

class Exception3_Chained{
  int sum(int i1,int i2)throws Exception{
    if(i1 + i2 >= 10){
      System.out.print("Enter Small numbers");
      ArithmeticException a = new ArithmeticException("\nopppssss!!!");
      a.initCause(new NullPointerException("\nNullpointer.....!!!"));
      throw a;
    }
    return 0;
  }
  public static void main(String[] args) {
    Exception3_Chained e = new Exception3_Chained();
    try{
      int s = e.sum(10,10);
    }catch(Exception m){
      System.out.print(m);
      System.out.print(m.getCause());
    }
  }
}
