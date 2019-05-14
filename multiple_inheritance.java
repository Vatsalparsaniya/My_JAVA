interface a{
  default void show(){
    System.out.print("lol\n");
  }
}
interface b extends a{
  default void show(){
    System.out.print("this is interface b gfds");
  }
}
interface c extends a{
  default void show(){
    // System.out.print("this is interface c\n");
   }
}
class multiple_inheritance implements b,c{
  public void show(){
    System.out.print("this is lol");
    // c.super.show();
    // b.super.show();
  }
  public static void main(String[] args) {
    d dd = new d();
    dd.show();
  }
}
