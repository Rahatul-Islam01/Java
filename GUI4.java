import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI4 implements ActionListener {
    JFrame f=new JFrame("Gram to Kilogram Conversion");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JLabel t1_l = new JLabel("Expression: ");
    JLabel t2_l = new JLabel("Result: ");
    JButton convert = new JButton("Convert");
    GUI4(){
        f.setBounds(450,200,400,300);
        t1_l.setBounds(50,50,100,30);
        t1.setBounds(200,50,100,30);
        convert.setBounds(50,100,100,50);
        t2_l.setBounds(50,200,100,30);
        t2.setBounds(200,200,180,50);
        f.getContentPane().setBackground(new Color(120,210,230));
        f.add(t1_l);
        f.add(t2_l);
        f.add(t1);
        f.add(t2);
        f.add(convert);
        f.setLayout(null);
        convert.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==convert){
            String str=t1.getText();
            t2.setText("");
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0')
                    t2.setText(t2.getText()+"Zero ");
                else if(str.charAt(i)=='1')
                    t2.setText(t2.getText()+"One ");
                else if(str.charAt(i)=='2')
                    t2.setText(t2.getText()+"Two ");
                else if(str.charAt(i)=='3')
                    t2.setText(t2.getText()+"Three ");
                else if(str.charAt(i)=='4')
                    t2.setText(t2.getText()+"Four ");
                else if(str.charAt(i)=='5')
                    t2.setText(t2.getText()+"Five ");
                else if(str.charAt(i)=='6')
                    t2.setText(t2.getText()+"Six ");
                else if(str.charAt(i)=='7')
                    t2.setText(t2.getText()+"Seven ");
                else if(str.charAt(i)=='8')
                    t2.setText(t2.getText()+"Eight ");
                if(str.charAt(i)=='9')
                    t2.setText(t2.getText()+"Nine ");
            }
        }
    }
    public static void main(String[] args) {
        new GUI4();
    }
}