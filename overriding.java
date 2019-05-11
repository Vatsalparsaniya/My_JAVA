abstract class p{
 abstractn void show();
}
class parent1 extends p
{
  void show(){
  System.out.println("hi");
}
}

class parent2 extends p
{
  void show(){
  System.out.println("hello");
}}

class overriding{
public static void main(String args[]){
  parent1 s1=new parent1();
  s1.show();

  parent2 s2 = new parent2();
  s2.show();
}
}
