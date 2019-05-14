import java.lang.*;

class MyThread extends Thread{
  public void run(){
    System.out.println(Thread.currentThread().getId());
  }
}
class T1{
  public static void main(String[] args) {
    int thread = 20;
    for(int i = 0 ; i < thread ; i++){
      MyThread t = new MyThread();
      t.start();
    }
  }
}
