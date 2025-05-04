import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI5 implements ActionListener {
    JFrame f=new JFrame();
    JTextField a = new JTextField();
    JTextField b = new JTextField();
    JTextField result = new JTextField();
    JButton sum = new JButton("+");
    JButton sub= new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");

    GUI5(){
        f.setBounds(450,200,500,400);
        a.setBounds(50,50,50,50);
        b.setBounds(300,50,50,50);
        result.setBounds(160,250,100,50);
        sum.setBounds(100,120,50,50);
        sub.setBounds(250,120,50,50);
        mul.setBounds(100,180,50,50);
        div.setBounds(250,180,50,50);
        f.add(a);
        f.add(b);
        f.add(result);
        f.add(sum);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.setLayout(null);
        sum.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int str1 = Integer.parseInt(a.getText());
        int str2 = Integer.parseInt(b.getText());

        int value=str1+str2;
        int value1=str1-str2;
        int value2=str1*str2;
        if(e.getSource()==sum){
            result.setText(value+"");
        }
         if (e.getSource()==sub) {
            result.setText(value1+"");
        }
         if (e.getSource()==mul){
            result.setText(value2+"");
        }
         if (e.getSource()==div){
             if(str2!=0){
                 int value3=str1/str2;
                 result.setText(value3+"");

             }
             else {
                 result.setText("can not devide by zero");

             }


         }

    }
    public static void main(String[] args) {
        new GUI5();
    }
}

