import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame{


  private Button b1,b2,back,o1,o2,o3,o4,answer;
  private Button[] n = new Button[10];
  private Frame frame;
  private TextField t1,t2;

  Calculator(){
    frame = new Frame();
    frame.setTitle("Calculator");
    frame.setSize(360,500);
    t1 = new TextField();
    b1 = new Button("(");
    b2 = new Button(")");
    o1 = new Button("+");
    o2 = new Button("-");
    o3 = new Button("*");
    o4 = new Button("/");
    n[0] = new Button("0");
    n[1] = new Button("1");
    n[2] = new Button("2");
    n[3] = new Button("3");
    n[4] = new Button("4");
    n[5] = new Button("5");
    n[6] = new Button("6");
    n[7] = new Button("7");
    n[8] = new Button("8");
    n[9] = new Button("9");
    back = new Button("Back");
    t2 = new TextField("Ans");
    answer = new Button("Answer");

    t1.setBounds(50,40,260,30);
    back.setBounds(260,90,50,30);
    t2.setBounds(50,90,190,30);
    o1.setBounds(260,140,50,50);
    o2.setBounds(260,210,50,50);
    o3.setBounds(260,280,50,50);
    o4.setBounds(260,350,50,50);
    n[1].setBounds(50,140,50,50);
    n[2].setBounds(120,140,50,50);
    n[3].setBounds(190,140,50,50);
    n[4].setBounds(50,210,50,50);
    n[5].setBounds(120,210,50,50);
    n[6].setBounds(190,210,50,50);
    n[7].setBounds(50,280,50,50);
    n[8].setBounds(120,280,50,50);
    n[9].setBounds(190,280,50,50);
    b1.setBounds(50,350,50,50);
    n[0].setBounds(120,350,50,50);
    b2.setBounds(190,350,50,50);
    answer.setBounds(120,420,120,50);

    frame.add(answer);
    frame.add(t1);
    frame.add(back);
    frame.add(n[0]);
    frame.add(n[1]);
    frame.add(n[2]);
    frame.add(n[3]);
    frame.add(n[4]);
    frame.add(n[5]);
    frame.add(n[6]);
    frame.add(n[7]);
    frame.add(n[8]);
    frame.add(n[9]);
    frame.add(t2);
    frame.add(b1);
    frame.add(b2);
    frame.add(o1);
    frame.add(o2);
    frame.add(o3);
    frame.add(o4);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
  }
}
