import java.lang.Thread;

class NewThread extends Thread{
    public void run(){
      for(int i = 0 ; i< 25 ; i++){
      System.out.println("samaj me aaya kya : I  :" + i);
      //throw new exception_User();
      try {
      Thread.sleep(500);
    }catch(Exception ec){
      System.out.print(ec);
    }
      }
    }

}
class exception_User extends Exception{
  //System.out.println("User define exception sleep here");
  //Thread.Sleep(5000);
}


class Thread_test{
  public static void main(String[] arg){
    NewThread th1 = new NewThread();
    NewThread th2 = new NewThread();
    NewThread th3 = new NewThread();
    NewThread th4 = new NewThread();
    NewThread th5 = new NewThread();

    th1.start();
    th2.start();
    th3.start();
    th4.start();
    th5.start();
  }
}
