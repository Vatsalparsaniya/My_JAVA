import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

class Calculator extends Frame implements ActionListener{

  private Button b1,b2,back,o1,o2,o3,o4,answer;
  private Button[] n = new Button[10];
  private Frame frame;
  private TextField t1,t2;
  private String textline;

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

    b1.addActionListener(this);
    b2.addActionListener(this);
    n[0].addActionListener(this);
    n[1].addActionListener(this);
    n[2].addActionListener(this);
    n[3].addActionListener(this);
    n[4].addActionListener(this);
    n[5].addActionListener(this);
    n[6].addActionListener(this);
    n[7].addActionListener(this);
    n[8].addActionListener(this);
    n[9].addActionListener(this);
    o1.addActionListener(this);
    o2.addActionListener(this);
    o3.addActionListener(this);
    o4.addActionListener(this);
    back.addActionListener(this);
    answer.addActionListener(this);

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


  public void actionPerformed(ActionEvent e){
      if(e.getSource() == back){
        String temp = t1.getText();
        t1.setText(temp.substring(0, temp.length() - 1));
      }
      else if(e.getSource() == n[1]){
        String temp = t1.getText();
        t1.setText(temp.concat("1"));
      }
      else if(e.getSource() == n[2]){
        String temp = t1.getText();
        t1.setText(temp.concat("2"));
      }
      else if(e.getSource() == n[3]){
        String temp = t1.getText();
        t1.setText(temp.concat("3"));
      }
      else if(e.getSource() == n[4]){
        String temp = t1.getText();
        t1.setText(temp.concat("4"));
      }
      else if(e.getSource() == n[5]){
        String temp = t1.getText();
        t1.setText(temp.concat("5"));
      }
      else if(e.getSource() == n[6]){
        String temp = t1.getText();
        t1.setText(temp.concat("6"));
      }
      else if(e.getSource() == n[7]){
        String temp = t1.getText();
        t1.setText(temp.concat("7"));
      }
      else if(e.getSource() == n[8]){
        String temp = t1.getText();
        t1.setText(temp.concat("8"));
      }
      else if(e.getSource() == n[9]){
        String temp = t1.getText();
        t1.setText(temp.concat("9"));
      }
      else if(e.getSource() == n[0]){
        String temp = t1.getText();
        t1.setText(temp.concat("0"));
      }
      else if(e.getSource() == b1){
        String temp = t1.getText();
        t1.setText(temp.concat("("));
      }
      else if(e.getSource() == b2){
        String temp = t1.getText();
        t1.setText(temp.concat(")"));
      }
      else if(e.getSource() == o1){
        String temp = t1.getText();
        t1.setText(temp.concat("+"));
      }
      else if(e.getSource() == o2){
        String temp = t1.getText();
        t1.setText(temp.concat("-"));
      }
      else if(e.getSource() == o3){
        String temp = t1.getText();
        t1.setText(temp.concat("*"));
      }
      else if(e.getSource() == o4){
        String temp = t1.getText();
        t1.setText(temp.concat("/"));
      }
      else if(e.getSource() == answer){
         String temp = t1.getText();
         int ans = evaluate(temp);
         System.out.println(ans);
         t2.setText(Integer.toString(ans));
      }
  }

  public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();

         // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {
             // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                int j = i;
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (j < tokens.length && tokens[j] >= '0' && tokens[j] <= '9')
                    sbuf.append(tokens[j++]);
                values.push(Integer.parseInt(sbuf.toString()));
            }

            // Current token is an opening brace, push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

            // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                     tokens[i] == '*' || tokens[i] == '/')
            {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }


  public static void main(String[] args) {
    Calculator calc = new Calculator();
  }
}
