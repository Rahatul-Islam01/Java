
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI7 extends JFrame implements ActionListener {
    JTextField text1 = new JTextField("30");
    JTextField text2 = new JTextField("20");
    JButton addition = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JLabel result = new JLabel();

    public GUI7() {
        super("Calculator");
        text1.setBounds(100, 50, 100, 50);
        text2.setBounds(300, 50, 100, 50);
        addition.setBounds(100, 150, 100, 50);
        sub.setBounds(300, 150, 100, 50);
        mul.setBounds(100, 250, 100, 50);
        div.setBounds(300, 250, 100, 50);
        result.setBounds(225, 350, 100, 50);
        add(text1);
        add(text2);
        add(addition);
        add(sub);
        add(mul);
        add(div);
        add(result);
        setLayout(null);
        addition.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
        setSize(500, 450);
        setLocation(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String digit1 = text1.getText();
        String digit2 = text2.getText();
        try {
            int num1 = Integer.parseInt(digit1);
            int num2 = Integer.parseInt(digit2);

            if (e.getActionCommand().equals("/")) {
                if (num2 != 0) {
                    int div1 = num1 / num2;
                    result.setText(Integer.toString(div1));
                } else {
                    result.setText("Cannot divide by 0");
                }
            } else if (e.getActionCommand().equals("*")) {
                int mul1 = num1 * num2;
                result.setText(Integer.toString(mul1));
            } else if (e.getActionCommand().equals("-")) {
                int sub1 = num1 - num2;
                result.setText(Integer.toString(sub1));
            } else if (e.getActionCommand().equals("+")) {
                int sum1 = num1 + num2;
                result.setText(Integer.toString(sum1));
            }
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new GUI7();

    }
}
