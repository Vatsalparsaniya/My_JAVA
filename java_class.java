import java.lang.Thread;

class addition implements Runnable{
  Thread t;
  int[] row;
  int sum = 0;
  static int finalSum = 0;
  addition(int[] row){

    this.row = row;
    t = new Thread(this,"NEW");
  }
  public void rowAddition(){
    int i = 0 ;
    while(i<row.length){
      sum = sum + row[i++];
    }
    System.out.print("sum of specific row is : " + sum );
  }
  public void run(){
    rowAddition();
    updateResult();
  }
  void updateResult(){
    this.finalSum += sum;
  }
}

class java_class {
  public static void main(String args[])throws Exception{
    int[][] arr = new int[][]{{1,2,3,},{4,5,6},{7,8,9}};
    addition a1 = new addition(arr[0]);
    addition a2 = new addition(arr[1]);
    addition a3 = new addition(arr[2]);
    a1.t.start();
    a2.t.start();
    a3.t.start();
    a1.t.join();
    a2.t.join();
    a3.t.join();
    System.out.print("final sum is  : " + addition.finalSum);
  }
}
