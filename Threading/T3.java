class join implements Runnable{
  public void run(){
    for(int i = 0 ; i < 10 ; i++){
      System.out.print(i);
      try{
        Thread.sleep(500);
      }catch(Exception e){
        System.out.print("Error:::!!!!....");
      }

    }
  }
}

class T3{
  public static void main(String[] args) {
    Thread t1 = new Thread(new join());
    Thread t2 = new Thread(new join());
    Thread t3 = new Thread(new join());
    t1.start();
    try{
      t1.join();
    }catch(Exception e){
      System.out.print("Enexpected :");
    }
    t2.start();
    t3.start();
  }
}
