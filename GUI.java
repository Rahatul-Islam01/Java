import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame f = new JFrame("FX991-MS");
    JTextField a = new JTextField();
    JButton num1 = new JButton("7");
    JButton num2 = new JButton("8");
    JButton num3 = new JButton("9");
    JButton num4 = new JButton("4");
    JButton num5 = new JButton("5");
    JButton num6 = new JButton("6");
    JButton num7 = new JButton("1");
    JButton num8 = new JButton("2");
    JButton num9 = new JButton("3");
    JButton num10 = new JButton("0");
    JButton clr = new JButton("C");
    JButton eql = new JButton("=");
    JButton op1 = new JButton("+");
    JButton op2 = new JButton("-");
    JButton op3 = new JButton("*");
    JButton op4 = new JButton("/");
    double firstNum, secondNum, result;
    char operator;

    GUI() {
        f.setBounds(550, 150, 500, 550);
        a.setBounds(50, 30, 350, 60);
        num1.setBounds(50, 100, 70, 70);
        num2.setBounds(130, 100, 70, 70);
        num3.setBounds(210, 100, 70, 70);
        num4.setBounds(50, 180, 70, 70);
        num5.setBounds(130, 180, 70, 70);
        num6.setBounds(210, 180, 70, 70);
        num7.setBounds(50, 260, 70, 70);
        num8.setBounds(130, 260, 70, 70);
        num9.setBounds(210, 260, 70, 70);
        num10.setBounds(50, 340, 70, 70);
        clr.setBounds(130, 340, 70, 70);
        eql.setBounds(210, 340, 70, 70);
        op1.setBounds(330, 100, 70, 70);
        op2.setBounds(330, 180, 70, 70);
        op3.setBounds(330, 260, 70, 70);
        op4.setBounds(330, 340, 70, 70);

        f.add(a);
        f.add(num1);
        f.add(num2);
        f.add(num3);
        f.add(num4);
        f.add(num5);
        f.add(num6);
        f.add(num7);
        f.add(num8);
        f.add(num9);
        f.add(num10);
        f.add(clr);
        f.add(eql);
        f.add(op1);
        f.add(op2);
        f.add(op3);
        f.add(op4);

        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num10.addActionListener(this);
        clr.addActionListener(this);
        op1.addActionListener(this);
        op2.addActionListener(this);
        op3.addActionListener(this);
        op4.addActionListener(this);
        eql.addActionListener(this);

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==num1){
            a.setText(a.getText()+"7");
        }
        if (e.getSource()==num2){
            a.setText(a.getText()+"8");
        }
        if (e.getSource()==num3){
            a.setText(a.getText()+"9");
        }
        if (e.getSource()==num4){
            a.setText(a.getText()+"4");
        }
        if (e.getSource()==num5){
            a.setText(a.getText()+"5");
        }
        if (e.getSource()==num6){
            a.setText(a.getText()+"6");
        }
        if (e.getSource()==num7){
            a.setText(a.getText()+"1");
        }
        if (e.getSource()==num8){
            a.setText(a.getText()+"2");
        }
        if (e.getSource()==num9){
            a.setText(a.getText()+"3");
        }
        if (e.getSource()==num10){
            a.setText(a.getText()+"0");
        }
        if (e.getSource()==op1){
            firstNum= Double.parseDouble(a.getText());
            operator= '+';
            a.setText("");
        }
        if (e.getSource()==op2){
            firstNum=Double.parseDouble(a.getText());
            operator= '-';
            a.setText("");
        }
        if (e.getSource()==op3){
            firstNum=Double.parseDouble(a.getText());
            operator= '*';
            a.setText("");
        }
        if (e.getSource()==op4){
            firstNum=Double.parseDouble(a.getText());
            operator= '/';
            a.setText("");
        }

        if (e.getSource()==eql){
            secondNum=Double.parseDouble(a.getText());

            switch(operator){
                case '+':
                    result=firstNum+secondNum;
                    break;
                case '-':
                    result=firstNum-secondNum;
                    break;
                case '*':
                    result=firstNum*secondNum;
                    break;
                case '/':
                    result=firstNum / secondNum;
                    break;
            }
            a.setText(String.valueOf(result));
            firstNum=result;
        }

        if(e.getSource()==clr) {
            a.setText("");
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}