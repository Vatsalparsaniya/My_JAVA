import java.lang.*;
import java.util.*;

class MyException extends Exception{
  String message;
  MyException(String m){
    this.message = m;
  }
  public String toString(){
    return "MyException Message : " +this.message;
  }
}
class Exception1_throw{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter number less then 10 :");
    int n = sc.nextInt();
    try{
        if(n >= 10){
          throw new MyException("Enter Valid Number");
        }
    }catch(Exception e){
      System.out.print("\nCaught in main , Message : "+ e);
    }finally{
      System.out.print("\nIn finally block ");
    }
    System.out.print("\nExit from main method");
  }
}
