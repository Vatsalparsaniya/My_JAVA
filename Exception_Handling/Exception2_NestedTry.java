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
class Exception2_NestedTry{

  public int sum(int i1,int i2)throws MyException{
    if(i1 + i2 >= 10){
      throw new MyException("Enter Valid Number So Sum will be less Then 10 :");
    }
    return 10;
  }

  public static void main(String[] args){
    Exception2_NestedTry exc = new Exception2_NestedTry();
    try {
          try {
            int s =  exc.sum(1,13);
            System.out.print("Sum is = "+s);
          }catch(Exception e){
            System.out.print(e);
            throw e;
          }
      }catch(Exception ev){
          System.out.print("\nOut :"+ev);
      }
      System.out.print("\nEnd of main");
  }
}
