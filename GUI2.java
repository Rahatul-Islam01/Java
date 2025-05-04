import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 implements ActionListener {
    JFrame f=new JFrame("welcome to our login system");
    JLabel name,pass,status;
    JTextField uname,upass;
    JButton login;
    GUI2(){
        name=new JLabel();
        pass=new JLabel();
        status=new JLabel("starting");
        uname=new JTextField();
        upass=new JTextField();
        login=new JButton();
        f.setBounds(350,100,400,400);
        name.setBounds(50,100,100,50);
        uname.setBounds(200,100,100,50);
        pass.setBounds(50,180,100,50);
        upass.setBounds(200,180,100,50);
        login.setBounds(150,250,70,50);
        status.setBounds(240,250,100,50);
        f.add(name);
        f.add(uname);
        f.add(pass);
        f.add(upass);
        f.add(login);
        f.add(status);
        f.setLayout(null);
        name.setText("name:");
        pass.setText("password:");
        login.setText("login ");
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
        f.getContentPane().setBackground(Color.orange);
        login.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
    public  void actionPerformed(ActionEvent e){
        if(uname.getText().equals("oop")&&upass.getText().equals("111")){
            status.setText("successful");
            login.setBackground(Color.red);

        }
        else{
            status.setText("try again");
            login.setBackground(Color.red);
        }


    }


    public static void main(String[] args) {
        new GUI2();
    }

}
