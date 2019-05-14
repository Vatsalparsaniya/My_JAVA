import java.lang.*;

class Thread_runnable implements Runnable{
  public void run(){
    System.out.println("this is "+Thread.currentThread().getId()+" Thread");
  }
}
class T2{
  public static void main(String[] args) {
    int thread = 20;
    for(int i = 0 ; i < thread ; i++){
      Thread t = new Thread(new Thread_runnable());
      t.start();
    }
  }
}
