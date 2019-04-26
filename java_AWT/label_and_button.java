import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class label_and_button extends Frame implements ActionListener {
    private Button button;
    private Label label;

    label_and_button(){

        Frame frame = new Frame();
        label = new Label("Not Clicked yet !!!");
        label.setBounds(200,200,100,100);
        button = new Button("Click Here");
        button.setBounds(10,10,100,100);
        button.addActionListener(this);
        frame.add(button);
        frame.add(label);
        frame.setSize(500,500);
        frame.setTitle("hello");
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        label.setText("Oh!! you clicked button");
    }
    public static void main(String[] args) {
        label_and_button d = new label_and_button();
    }
}
