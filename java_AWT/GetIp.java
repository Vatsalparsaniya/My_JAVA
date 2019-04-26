import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
class GetIp extends Frame{
  private Button button;
  private TextField textField;
  private Label label;
  private Frame frame;

  GetIp(){
    frame = new Frame();
    button = new Button("FIND IP");
    textField = new TextField();
    textField.setText("Enter Website  \nex : www.google.com");
    label = new Label();
    label.setText("Youre IP is :");

          button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              String site  = textField.getText();
            try{
              String ip = InetAddress.getByName(site).getHostAddress();
              label.setText("Youre IP is : " + ip);
            }catch(Exception ex){
              System.out.print(ex);
            }
            }
          });

      textField.setBounds(100,100,300,20);
      button.setBounds(100,150,100,20);
      label.setBounds(100,200,200,20);
      frame.setSize(500,250);
      frame.setTitle("FIND IP BY HOST NAME");
      frame.add(button);
      frame.add(label);
      frame.add(textField);
      frame.setLayout(null);
      frame.setVisible(true);
  }

  public static void main(String[] args) {
      GetIp gip = new GetIp();
  }
}
