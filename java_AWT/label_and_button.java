import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class label_and_button extends Frame implements ActionListener {
    private Button button;
    private Button button2;
    private Label label;
    private Frame frame;
    label_and_button(){

        frame = new Frame();
        label = new Label("Not Clicked yet !!!");
        label.setBounds(200,200,200,200);
        button = new Button("Click Here");
        button.setBounds(10,10,100,100);
        button.addActionListener(this);
        frame.add(button);
        frame.add(label);
        button2 = new Button("click Me");
        //button2.setText("Click Me For Do some thing");
        button2.setBounds(200,200,300,100);
        button2.setSize(300,300);
        button2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            frame.setTitle("Somethig Like lamda Expression");
          }
        });
        frame.add(button2);
        frame.setSize(500,500);
        frame.setTitle("hello");
        frame.setLayout(null);
        frame.setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        label.setText("Oh!! you clicked button");
        frame.setTitle("hello this is second Title :");
    }
    public static void main(String[] args) {
        label_and_button d = new label_and_button();
    }
}
