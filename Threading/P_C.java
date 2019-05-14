class A{
  int num;
  boolean set = false;
  public synchronized  void put(int num){
    if(set){
      try{
      wait();
    }catch(Exception e){
      System.out.print(e);
    }
    }
    System.out.println("put :"+ num);
    this.num = num;
    set = true;
    notify();
  }
  public synchronized  void get(){
    if(!set){
      try{
      wait();
    }catch(Exception e){
      System.out.print(e);
    }
    }
    System.out.println("get :"+ num);
    this.num = num;
    set = false;
    notify();
  }
}
class producer implements Runnable{
  A a;
  Thread t;
  producer(A a){
    this.a = a;
    t = new Thread(this,"producer");
    t.start();
  }
  public void run(){
    int i= 0;
    while(true){
      a.put(i++);
    }
  }
}
class Consumer implements Runnable{
  A a;
  Consumer(A a){
    this.a = a;
    Thread t = new Thread(this,"Consumer");
    t.start();
  }
  public void run(){
    while(true){
      a.get();
    }
  }
}

class P_C{
  public static void main(String[] args) {
    A a = new A();
    producer p = new producer(a);
    Consumer c = new Consumer(a);

  }
}
