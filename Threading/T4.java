class Table{
  synchronized  void printTable(int n){
    for (int i = 1 ; i <= 10 ; i++){
      System.out.println(i*n);
      try{
        Thread.sleep(500);
      }catch(Exception ee){
        System.out.print(ee);
      }
    }
  }
}

class T4 extends Table{
  synchronized void pTable(int n){
    for (int i = 1 ; i <= 10 ; i++){
      System.out.println(i*n);
      try{
        Thread.sleep(500);
      }catch(Exception eee){
        System.out.print(eee);
      }
    }
  }
  public static void main(String[] args) {
    T4 t34 = new T4();
    Table table = new Table();
    Thread t1 = new Thread(){
    public void run(){
        table.printTable(5);
      }
    };
    Thread t2 = new Thread(){
      public void run(){
        table.printTable(23);
      }
    };
    Thread t3 = new Thread(){
      public void run(){
        t34.pTable(11);
      }
    };


    t3.start();
    try{
      t3.join();
    }catch(Exception e){
      System.out.print(e);
    }
    t1.start();
    // try{
    //   t1.join();
    // }catch(Exception e){
    //   System.out.print(e);
    // }
    t2.start();

    System.out.print("In main thread");
  }

}
