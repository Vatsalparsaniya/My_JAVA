import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
class AWT_Button_and_label extends Frame implements ActionListener{

  private Button button;
  private TextField textfild;

  AWT_Button_and_label(){
    Frame frame = new Frame();
    button = new Button("Click Me ");
    textfild = new TextField();
    textfild.setBounds(100,200,200,200);
    //button.setText("click me :");
    button.setBounds(20,20,100,100);
    button.addActionListener(this);
    frame.add(textfild);
    frame.add(button);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
      textfild.setText("Welcome");
    }
    public static void main(String[] args) {
      AWT_Button_and_label frame1 = new AWT_Button_and_label();
    }
}
