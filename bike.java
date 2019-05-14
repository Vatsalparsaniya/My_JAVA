interface a{
  int speeda(int s);
}
interface b extends a{
  default int speedb(int s){
    return s+1+speeda(12312);
  }
}
interface c extends a{
  default int speedc(int s){
      return s+10;
  }
}

class bike implements b,c{
    // public int speed(int aa){
    //   System.out.print(aa);
    //   return aa;
    // }
    // public int speed(int s){
    //   int ccc = c.speed(s);
    //   return ccc;
    // }
    // public int speedb(int ddd){
    //   System.out.print("\n");
    //   return 11111;
    // }
    public int speeda(int aaa){
      System.out.print("\n"+aaa);
      return 123;
    }
  public static void main(String[] args) {
    bike b1 = new bike();
    int aa = b1.speedc(10);
    System.out.print(aa+"\n");
    System.out.print(b1.speeda(10));
    System.out.print(b1.speedb(10));
  }
}
