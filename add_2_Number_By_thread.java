import java.lang.Thread;
import java.util.Scanner;

class NewThread extends Thread{
    String s = new String();
    NewThread(String s){
      this.s = s;
    }

  public void run(){
    System.out.println("thread  " + this.s + "  is Start ");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter " + this.s + "  Number 1 :");
    int n1 = sc.nextInt();
    System.out.println("enter " + this.s + "  Number 2 :");
    int n2 = sc.nextInt();
    int ans = n1 + n2 ;
    System.out.println("Ans  " + this.s + "  : " + ans);

  }

}

class add_2_Number_By_thread{
  static String[]  string = new String[6];
  static  int i = 0;
  public static void main(String[] args) {
    string[0] = "first";
    string[1] = "second";
    string[2] = "third";
    string[3] = "forth";
    string[4] = "fifth";
    string[5] = "six";
    NewThread t1 = new NewThread(string[i++]);
    NewThread t2 = new NewThread(string[i++]);
    NewThread t3 = new NewThread(string[i++]);
    NewThread t4 = new NewThread(string[i++]);
    NewThread t5 = new NewThread(string[i++]);
    NewThread t6 = new NewThread(string[i++]);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    System.out.println("\n\n\nExit from main method");
  }

}
